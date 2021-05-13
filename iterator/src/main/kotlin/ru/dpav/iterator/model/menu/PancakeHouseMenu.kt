package ru.dpav.iterator.model.menu

import ru.dpav.iterator.model.MenuItem

class PancakeHouseMenu : Menu {
    private val menuItems = arrayListOf<MenuItem>()

    init {
        addItem(
            "K&B's Pancake Breakfast",
            "Pancakes with Scrambled eggs, ant toast",
            true,
            2.99
        )
        addItem(
            "Regular Pancake Breakfast",
            "Pancake with fried eggs, sausage",
            false,
            2.99
        )
        addItem(
            "Blueberry Pancakes",
            "Pancakes made with fresh blueberries",
            true,
            3.49
        )
        addItem(
            "Waffles",
            "Waffles, with your choice of blueberries or strawberries",
            true,
            3.59
        )
    }

    override fun createIterator(): MutableIterator<MenuItem> {
        return menuItems.iterator()
    }

    private fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double) {
        menuItems += MenuItem(name, description, isVegetarian, price)
    }
}