package factory.pizzastore.store

import factory.pizzastore.pizza.Pizza

abstract class PizzaStore {

    companion object {
        const val TYPE_CHEESE = "cheese"
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