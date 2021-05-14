package ru.dpav.iterator

import org.junit.jupiter.api.Test
import ru.dpav.iterator.model.menu.CafeMenu
import ru.dpav.iterator.model.menu.DinerMenu
import ru.dpav.iterator.model.menu.PancakeHouseMenu

internal class WaitressTest {

    @Test
    fun test() {
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()
        val cafeMenu = CafeMenu()

        val waitress = Waitress(pancakeHouseMenu, dinerMenu, cafeMenu)
        waitress.printMenu()
    }
}