package ru.dpav.templatemethod.sorting

import org.junit.jupiter.api.Test
import java.util.*

internal class DuckTest {

    @Test
    fun sort() {
        val ducks = arrayOf(
            Duck("Daffy", 8),
            Duck("Dewey", 2),
            Duck("Howard", 7),
            Duck("Louie", 2),
            Duck("Donald", 10),
            Duck("Huey", 2)
        )
        println("Before sorting:")
        ducks.display()

        Arrays.sort(ducks)

        println("\nAfter sorting:")
        ducks.display()
    }

    private fun Array<Duck>.display() {
        this.forEach { duck -> println(duck) }
    }
}