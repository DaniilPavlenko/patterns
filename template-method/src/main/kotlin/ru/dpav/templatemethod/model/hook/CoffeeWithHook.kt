package ru.dpav.templatemethod.model.hook

class CoffeeWithHook : CaffeineBeverageWithHook() {

    var isCustomerWantsCondiments: Boolean = false

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments(): Boolean {
        return isCustomerWantsCondiments
    }
}