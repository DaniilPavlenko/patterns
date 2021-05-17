package ru.dpav.composite.model

import ru.dpav.composite.model.component.MenuComponent

class Waitress(private val menu: MenuComponent) {

    fun printMenu() = menu.print()

    fun printVegetarianMenu() {
        val iterator = menu.createIterator()
        println("Vegetarian menu\n----------")
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print()
                }
            } catch (ignore: UnsupportedOperationException) {
            }
        }
    }
}