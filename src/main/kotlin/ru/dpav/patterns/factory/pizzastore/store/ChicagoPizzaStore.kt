package ru.dpav.patterns.factory.pizzastore.store

import ru.dpav.patterns.factory.pizzastore.ingredient.factory.ChicagoPizzaIngredientFactory
import ru.dpav.patterns.factory.pizzastore.ingredient.factory.PizzaIngredientFactory
import ru.dpav.patterns.factory.pizzastore.pizza.CheesePizza
import ru.dpav.patterns.factory.pizzastore.pizza.ClamPizza
import ru.dpav.patterns.factory.pizzastore.pizza.Pizza

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(pizzaType: String): Pizza {
        val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()
        return when (pizzaType) {
            TYPE_CHEESE -> CheesePizza(ingredientFactory)
                .apply { name = "Chicago Style Cheese Pizza" }
            TYPE_CLAMS -> ClamPizza(ingredientFactory)
                .apply { name = "Chicago Style Clams Pizza" }
            else -> throw IllegalArgumentException("Unexpected pizza type = $pizzaType")
        }
    }
}