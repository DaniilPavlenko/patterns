package ru.dpav.patterns.factory.pizzastore.ingredient.factory

import ru.dpav.patterns.factory.pizzastore.ingredient.SlicedPepperoni
import ru.dpav.patterns.factory.pizzastore.ingredient.type.*

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThickCrustDough()

    override fun createSauce(): Sauce = PlumTomatoSauce()

    override fun createCheese(): Cheese = Mozzarella()

    override fun createVeggies(): Array<Veggies> = arrayOf(BlackOlives(), EggPlant(), Spinach())

    override fun createPepperoni(): Pepperoni = SlicedPepperoni()

    override fun createClam(): Clams = FrozenClams()
}