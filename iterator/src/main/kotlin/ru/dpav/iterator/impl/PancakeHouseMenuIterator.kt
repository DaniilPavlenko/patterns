package ru.dpav.iterator.impl

import ru.dpav.iterator.Iterator
import ru.dpav.iterator.model.MenuItem

class PancakeHouseMenuIterator(
    private val items: List<MenuItem>
) : Iterator<MenuItem> {

    var position: Int = 0

    override fun next() = items[position++]

    override fun hasNext() = position < items.count()
}