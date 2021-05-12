package ru.dpav.iterator.model.menu

import ru.dpav.iterator.model.MenuItem

class DinerMenu {

    var menuItems = arrayOfNulls<MenuItem>(MAX_ITEMS)
    private var numberOfItems = 0

    init {
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99)
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99)
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29)
        addItem("Hotdog", "A hod dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05)
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        if (numberOfItems >= MAX_ITEMS) {
            error("Sorry, menu is full! Can't add item to menu")
        } else {
            menuItems[numberOfItems++] = MenuItem(name, description, vegetarian, price)
        }
    }

    companion object {
        const val MAX_ITEMS = 6
    }
}