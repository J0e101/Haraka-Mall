package com.j0e101.harakamall.repository
import com.j0e101.harakamall.data.UserDao
import com.j0e101.harakamall.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}
