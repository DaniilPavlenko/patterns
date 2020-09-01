package factory.pizzastore.store

import factory.pizzastore.ingredient.factory.NYPizzaIngredientFactory
import factory.pizzastore.ingredient.factory.PizzaIngredientFactory
import factory.pizzastore.pizza.CheesePizza
import factory.pizzastore.pizza.ClamPizza
import factory.pizzastore.pizza.Pizza

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