package ru.skillbrach.devintensive.models

class UserView(
        val id: String,
        val fullName:String,
        val nicName:String,
        var avatar:String? = null,
        var status:String? = "offline",
        val initials:String?
        )
