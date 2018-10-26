package ai.gvs.mvp.data

import ai.gvs.mvp.models.User

interface UsersDataSource {
    fun getUsers()
    fun createUser(user: User)
    fun updateUser()
    fun removeUser()
}