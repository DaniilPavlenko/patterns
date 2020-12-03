package ru.dpav.patterns.factory.pizzastore.store

import ru.dpav.patterns.factory.pizzastore.ingredient.factory.NYPizzaIngredientFactory
import ru.dpav.patterns.factory.pizzastore.ingredient.factory.PizzaIngredientFactory
import ru.dpav.patterns.factory.pizzastore.pizza.CheesePizza
import ru.dpav.patterns.factory.pizzastore.pizza.ClamPizza
import ru.dpav.patterns.factory.pizzastore.pizza.Pizza

class NYPizzaStore : PizzaStore() {

    override fun createPizza(pizzaType: String): Pizza {
        val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()
        return when (pizzaType) {
            TYPE_CHEESE -> CheesePizza(ingredientFactory)
                .apply { name = "New York Style Cheese Pizza" }
            TYPE_CLAMS -> ClamPizza(ingredientFactory)
                .apply { name = "New York Style Clams Pizza" }
            else -> throw IllegalArgumentException("Unexpected pizza type = $pizzaType")
        }
    }
}