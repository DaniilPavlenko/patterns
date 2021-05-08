package ru.dpav.templatemethod.model.hook

class TeaWithHook : CaffeineBeverageWithHook() {

    var isCustomerWantsCondiments: Boolean = false

    override fun brew() = println("Steeping the tea")

    override fun addCondiments() = println("Adding lemon")

    override fun customerWantsCondiments(): Boolean {
        return isCustomerWantsCondiments
    }
}