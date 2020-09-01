package factory.pizzastore.pizza

import factory.pizzastore.ingredient.type.*

abstract class Pizza {

    var name: String = ""
    protected var dough: Dough? = null
    protected var sauce: Sauce? = null
    protected var veggies: Array<Veggies> = emptyArray()
    protected var cheese: Cheese? = null
    protected var pepperoni: Pepperoni? = null
    protected var clams: Clams? = null

    abstract fun prepare()

    open fun bake() = println("Bake for 25 minutes at 350")

    open fun cut() = println("Cutting the pizza into diagonal slices")

    open fun box() = println("Place pizza in official PizzaStore box")
}