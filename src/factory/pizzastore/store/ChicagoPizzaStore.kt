package factory.pizzastore.store

import factory.pizzastore.pizza.Pizza
import factory.pizzastore.pizza.chicago.ChicagoStyleCheesePizza

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(pizzaType: String): Pizza {
        return when (pizzaType) {
            TYPE_CHEESE -> ChicagoStyleCheesePizza()
            else -> throw IllegalArgumentException("Unexpected pizza type = $pizzaType")
        }
    }
}