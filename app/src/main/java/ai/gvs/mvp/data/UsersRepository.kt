package ai.gvs.mvp.data

import ai.gvs.mvp.data.dao.UserDao
import ai.gvs.mvp.models.User

class UsersRepository(
    var mUsersRemoteDataSource: UsersDataSource?,
    var mUserLocalDataSource: UsersDataSource?
) : UsersDataSource {

    var INSTANCE: UsersRepository? = null

    fun getInstance(tasksRemoteDataSource: UsersDataSource, tasksLocalDataSource: UsersDataSource): UsersRepository {
        if (INSTANCE == null) {
            INSTANCE = UsersRepository(tasksRemoteDataSource, tasksLocalDataSource)
        }
        return INSTANCE!!
    }

    fun destroyInstance() {
        INSTANCE = null
    }

    override fun getUsers() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createUser(user: User) {
        this.mUserLocalDataSource?.createUser(user)
    }

    override fun updateUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeUser() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}