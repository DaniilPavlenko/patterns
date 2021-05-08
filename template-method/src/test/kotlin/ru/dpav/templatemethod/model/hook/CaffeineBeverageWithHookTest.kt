package ru.dpav.templatemethod.model.hook

import org.junit.jupiter.api.Test

internal class CaffeineBeverageWithHookTest {

    @Test
    fun test() {
        val teaHook = TeaWithHook().apply {
            isCustomerWantsCondiments = true
        }
        val coffeeHook = CoffeeWithHook()

        println("\nMaking tea...")
        teaHook.prepareRecipe()

        println("\nMaking coffee...")
        coffeeHook.prepareRecipe()
    }
}