package ru.gb.student.kotlin_demoapp

object User {
    private val userData = UsersData("Default User", 23)

    fun getData(): UsersData {
        return userData
    }
}