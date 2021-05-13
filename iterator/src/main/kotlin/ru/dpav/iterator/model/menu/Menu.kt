package ru.dpav.iterator.model.menu

import ru.dpav.iterator.model.MenuItem

interface Menu {
    fun createIterator(): MutableIterator<MenuItem>
}