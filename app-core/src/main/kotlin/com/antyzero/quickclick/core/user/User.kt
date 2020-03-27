package com.antyzero.quickclick.core.user

sealed class User(val id: String) {

    class Anonymous(id: String) : User(id)
}