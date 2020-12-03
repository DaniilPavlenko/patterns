package ru.dpav.patterns.factory.pizzastore

import ru.dpav.patterns.factory.pizzastore.pizza.Pizza
import ru.dpav.patterns.factory.pizzastore.store.ChicagoPizzaStore
import ru.dpav.patterns.factory.pizzastore.store.NYPizzaStore
import ru.dpav.patterns.factory.pizzastore.store.PizzaStore

object MainPizzaStore {

    @JvmStatic
    fun main(args: Array<String>) {
        val nyStore: PizzaStore = NYPizzaStore()
        val chicagoStore: PizzaStore = ChicagoPizzaStore()

        var pizza: Pizza = nyStore.orderPizza(PizzaStore.TYPE_CHEESE)
        println("Ethan ordered a ${pizza.name}\n")

        pizza = chicagoStore.orderPizza(PizzaStore.TYPE_CHEESE)
        println("Joel ordered a ${pizza.name}\n")
    }
}