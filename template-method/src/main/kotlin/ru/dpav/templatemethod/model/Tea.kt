package ru.dpav.templatemethod.model

class Tea : CaffeineBeverage() {

    override fun brew() = println("Steeping the tea")

    override fun addCondiments() = println("Adding lemon")
}