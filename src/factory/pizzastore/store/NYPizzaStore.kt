package factory.pizzastore.store

import factory.pizzastore.pizza.Pizza
import factory.pizzastore.pizza.ny.NYStyleCheesePizza

class NYPizzaStore : PizzaStore() {

    override fun createPizza(pizzaType: String): Pizza {
        return when (pizzaType) {
            TYPE_CHEESE -> NYStyleCheesePizza()
            else -> throw IllegalArgumentException("Unexpected pizza type = $pizzaType")
        }
    }
}