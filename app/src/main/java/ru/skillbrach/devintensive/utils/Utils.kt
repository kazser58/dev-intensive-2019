package ru.skillbrach.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{

        val parts : List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        if (firstName == "") firstName = null
        if (lastName == "") lastName = null


        return firstName to lastName
    }
}