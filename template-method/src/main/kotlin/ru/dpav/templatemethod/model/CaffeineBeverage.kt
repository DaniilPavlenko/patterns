package ru.dpav.templatemethod.model

abstract class CaffeineBeverage {

    abstract fun brew()
    abstract fun addCondiments()

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    fun boilWater() = println("Boiling water")
    fun pourInCup() = println("Pouring into cup")
}