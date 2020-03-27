package com.antyzero.quickclick.core.user

/**
 * Should generate persistent user ID
 */
interface UserIdGenerator {

    fun generate(): String
}