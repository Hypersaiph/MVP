package ai.gvs.mvp.users

import ai.gvs.mvp.R
import ai.gvs.mvp.data.AppDatabase
import ai.gvs.mvp.data.UsersRepository
import ai.gvs.mvp.data.dao.UserDao
import ai.gvs.mvp.data.local.UserLocalDataSource
import ai.gvs.mvp.data.remote.UsersRemoteDataSource
import ai.gvs.mvp.models.User
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class UsersActivity : AppCompatActivity(), UsersContract.View {

    var db: AppDatabase? = null
    var userDao: UserDao? = null
    private var mUsersPresenter: UsersPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = AppDatabase.INSTANCE
        //userDao = db?.userDao()
        var remote = UsersRemoteDataSource()
        var local = UserLocalDataSource()
        var a = UsersRepository(remote, local)
        a.createUser(User("name lastname","address", "birthdate", "phoneNumber", "geovas@gmail.com"))

        mUsersPresenter = UsersPresenter(this)
    }

    override fun initView() {
        mText.text = mUsersPresenter?.getCounter()
        mButton.setOnClickListener {
            mUsersPresenter?.incrementValue()
        }
    }

    override fun updateViewData() {
        mText.text = mUsersPresenter?.getCounter()
    }
}