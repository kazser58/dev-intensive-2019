package ru.skillbrach.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbrach.devintensive.models.User
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
        val user = User.makeUser("John Wick")
        println(user)
    }
}
