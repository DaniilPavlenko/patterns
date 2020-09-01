package factory.pizzastore.pizza

import factory.pizzastore.ingredient.factory.PizzaIngredientFactory

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}