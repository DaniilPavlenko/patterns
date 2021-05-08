package ru.dpav.templatemethod.model

import org.junit.jupiter.api.Test

internal class CaffeineBeverageTest {

    @Test
    fun test() {
        val tea = Tea()
        val coffee = Coffee()

        println("\nMaking tea...")
        tea.prepareRecipe()

        println("\nMaking coffee...")
        coffee.prepareRecipe()
    }
}