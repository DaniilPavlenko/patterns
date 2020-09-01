package factory.pizzastore.store

import factory.pizzastore.ingredient.factory.ChicagoPizzaIngredientFactory
import factory.pizzastore.ingredient.factory.PizzaIngredientFactory
import factory.pizzastore.pizza.CheesePizza
import factory.pizzastore.pizza.ClamPizza
import factory.pizzastore.pizza.Pizza

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