package factory.pizzastore.pizza

abstract class Pizza {

    var name: String = ""
    protected var dough: String = ""
    protected var sauce: String = ""
    protected val toppings = arrayListOf<String>()

    open fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        toppings.forEach { println("\t$it") }
    }

    open fun bake() = println("Bake for 25 minutes at 350")

    open fun cut() = println("Cutting the pizza into diagonal slices")

    open fun box() = println("Place pizza in official PizzaStore box")
}