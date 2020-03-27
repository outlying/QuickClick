package com.antyzero.quickclick.core.user

class UserManager(
    private val userIdGenerator: UserIdGenerator
) {

    fun getUser() : User {
        return User.Anonymous
    }
}