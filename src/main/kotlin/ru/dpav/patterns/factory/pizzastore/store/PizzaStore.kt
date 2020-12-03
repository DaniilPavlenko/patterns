package ru.dpav.patterns.factory.pizzastore.store

import ru.dpav.patterns.factory.pizzastore.pizza.Pizza

abstract class PizzaStore {

    companion object {

        const val TYPE_CHEESE = "cheese"
        const val TYPE_CLAMS = "clams"
    }

    fun orderPizza(pizzaType: String): Pizza {
        return createPizza(pizzaType).apply {
            prepare()
            bake()
            cut()
            box()
        }
    }

    protected abstract fun createPizza(pizzaType: String): Pizza
}