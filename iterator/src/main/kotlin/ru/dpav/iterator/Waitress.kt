package ru.dpav.iterator

import ru.dpav.iterator.model.MenuItem
import ru.dpav.iterator.model.menu.Menu

class Waitress(
    private val pancakeHouseMenu: Menu,
    private val dinerMenu: Menu
) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()
        println("MENU\n---\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLAUNCH")
        printMenu(dinerIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            with(iterator.next()) {
                println("* $name, $price -- $description")
            }
        }
    }
}