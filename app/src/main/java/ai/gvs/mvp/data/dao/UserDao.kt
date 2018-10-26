package ai.gvs.mvp.data.dao

import ai.gvs.mvp.data.entity.User
import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*


@Dao
interface UserDao {

    @Query("SELECT * FROM User ORDER BY name ASC")
    fun getUsers(): LiveData<List<User>>

    @Query("SELECT * FROM USER WHERE id=:id")
    fun getUserById(id: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun removeUser(user: User)
}