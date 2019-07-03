package ru.skillbrach.devintensive.models

import java.util.*

class TestMassage(
    id:String,
    from:User?,
    chat:Chat,
    isIncoming:Boolean = false,
    date: Date = Date(),
    var text:String?
) : BaseMessage(id, from, chat, isIncoming, date) {
    override fun formatMassage(): String = "id:$id ${from?.firstName} ${if (isIncoming) "получил" else "отправил"} сообщение \"$text\" "
}