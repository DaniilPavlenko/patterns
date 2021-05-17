package ru.dpav.composite.model

import ru.dpav.composite.model.component.MenuComponent

class Waitress(
    private val menu: MenuComponent
) {
    fun printMenu() = menu.print()
}