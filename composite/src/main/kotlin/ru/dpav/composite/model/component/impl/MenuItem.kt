package ru.dpav.composite.model.component.impl

import ru.dpav.composite.model.component.MenuComponent

class MenuItem(
    private val name: String,
    private val description: String,
    private val vegetarian: Boolean,
    private val price: Double
) : MenuComponent() {

    override fun getName() = name

    override fun getDescription() = description

    override fun getPrice() = price

    override fun isVegetarian() = vegetarian

    override fun print() {
        val vegetarianStr = if (isVegetarian()) "(v)" else ""
        println(" ${getName()} ${vegetarianStr}, $price -- ${getDescription()}")
    }
}