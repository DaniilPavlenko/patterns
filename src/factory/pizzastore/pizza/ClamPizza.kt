package factory.pizzastore.pizza

import factory.pizzastore.ingredient.factory.PizzaIngredientFactory

class ClamPizza(private var ingredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clams = ingredientFactory.createClam()
    }
}