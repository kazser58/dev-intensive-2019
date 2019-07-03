package ru.skillbrach.devintensive.extensions

import ru.skillbrach.devintensive.models.User
import ru.skillbrach.devintensive.models.UserView
import java.util.*

fun User.toUserView() : UserView{
    val nickName = ""
    val initials = ""
    val status = if (lastVisit == null) "Еще не разу не был" else if (isOnline) "online" else "Последний раз был "
            //${lastVisit.humanizeDiff()}"

    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = avatar,
        nicName = nickName,
        initials = initials,
        status = status)
}

//private fun Date.humanizeDiff(date:Date): String { }
