package ru.dpav.composite.model

import org.junit.jupiter.api.Test
import ru.dpav.composite.model.component.MenuComponent
import ru.dpav.composite.model.component.impl.Menu
import ru.dpav.composite.model.component.impl.MenuItem

internal class WaitressTest {

    @Test
    fun printMenu() {
        val menu1 = Menu("Menu 1", "Description of the menu 1").apply {
            addItem("1-1", "1", true, 2.99)
            addItem("1-2", "2", false, 3.99)
            addItem("1-3", "3", false, 2.59)
        }
        val menu2 = Menu("Menu 2", "Description of the menu 2").apply {
            addItem("2-1", "1", false, 1.99)
            addItem("2-2", "2", false, 2.99)
        }
        val menu3 = Menu("Menu 3", "Description of the menu 3").apply {
            addItem("3-1", "1", true, 3.59)
            addItem("3-2", "2", true, 2.89)
        }

        val allMenus: MenuComponent = Menu("All menus", "All menus combined").apply {
            add(menu1)
            add(menu2)
            add(menu3)
        }

        val desertMenu = Menu("Desert Menu", "Description of the desert menu").apply {
            addItem("d-1", "1", true, 2.49)
            addItem("d-2", "2", true, 2.79)
        }

        menu3.add(desertMenu)

        val waitress = Waitress(allMenus)
        waitress.printMenu()
    }

    private fun Menu.addItem(name: String, desc: String, isVegetarian: Boolean, price: Double) {
        add(MenuItem("MenuItem $name", "desc $desc", isVegetarian, price))
    }
}