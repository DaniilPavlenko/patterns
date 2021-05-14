package ru.dpav.iterator.model.menu

import ru.dpav.iterator.model.MenuItem
import java.util.*

class CafeMenu : Menu {

    private val menuItems = Hashtable<String, MenuItem>()

    init {
        addItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true,
            3.99
        )
        addItem(
            "Soup of the day",
            "A cup of the soup of the day, with a side salad",
            true,
            3.69
        )
        addItem(
            "Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true,
            4.29
        )
    }

    override fun createIterator(): MutableIterator<MenuItem> {
        return menuItems.values.iterator()
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        MenuItem(name, description, vegetarian, price).also { item ->
            menuItems[name] = item
        }
    }
}