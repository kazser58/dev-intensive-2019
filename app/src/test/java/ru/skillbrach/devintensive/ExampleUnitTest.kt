package ru.skillbrach.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbrach.devintensive.extensions.TimeUnits
import ru.skillbrach.devintensive.extensions.add
import ru.skillbrach.devintensive.extensions.format
import ru.skillbrach.devintensive.models.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance() {

        val user2 = User("2", "John","Cena")

    }

    @Test
    fun test_factory() {
        val user = User.makeUser("John")
        var user2 = user.copy("1", lastName = "Cena" , lastVisit = Date().add(2, TimeUnits.HOUR))
        var user3 = user.copy("2", lastName = "Wick" , lastVisit = Date().add(-2, TimeUnits.SECOND))
        print("""
            ${user2.lastVisit?.format()}
            ${user3.lastVisit?.format()}
            """ .trimIndent())
    }


    @Test
    fun test_abstract_factory(){
        val user = User.makeUser("Ковалев Александр")
        val txtMassage = BaseMessage.makeMassage(user, Chat("0"), payload = "any text massage", type = "text")
        val imgMassage = BaseMessage.makeMassage(user, Chat("0"), payload = "any image url", type = "image")

        println(txtMassage.formatMassage())
        println(imgMassage.formatMassage())
    }
}
