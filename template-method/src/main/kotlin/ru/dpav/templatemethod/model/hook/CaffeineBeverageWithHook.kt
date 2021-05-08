package ru.dpav.templatemethod.model.hook

abstract class CaffeineBeverageWithHook {

    abstract fun brew()
    abstract fun addCondiments()

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    fun boilWater() = println("Boiling water")

    fun pourInCup() = println("Pouring into cup")

    open fun customerWantsCondiments(): Boolean {
        return true
    }
}