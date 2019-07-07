package ru.skillbrach.devintensive.models

import java.util.*
import kotlin.system.measureTimeMillis

abstract class BaseMessage(
    val id:String,
    val from:User?,
    val chat:Chat,
    val isIncoming:Boolean = false,
    val date: Date = Date()
)

{
    abstract fun formatMassage():String

    companion object AbstractFactory {
        var lastId = -1;

        fun makeMassage(from: User?, chat: Chat, date:Date = Date(), type:String = "text", payload:Any?): BaseMessage {
            lastId++
            return when(type) {
                "image" -> ImageMassage("$lastId", from, chat, date = date, image = payload as String)
                    else -> TextMassage("$lastId", from, chat, date = date, text = payload as String)
            }
        }
    }
}