package factory.pizzastore.ingredient.factory

import factory.pizzastore.ingredient.*
import factory.pizzastore.ingredient.type.*

class NYPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThinCrustDough()

    override fun createSauce(): Sauce = MarinaraSauce()

    override fun createCheese(): Cheese = ReggianoCheese()

    override fun createVeggies(): Array<Veggies> = arrayOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClam(): Clams = FreshClams()
}