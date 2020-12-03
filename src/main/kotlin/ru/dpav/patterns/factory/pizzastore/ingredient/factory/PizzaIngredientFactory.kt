package ru.dpav.patterns.factory.pizzastore.ingredient.factory

import ru.dpav.patterns.factory.pizzastore.ingredient.type.*

interface PizzaIngredientFactory {

    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Array<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}