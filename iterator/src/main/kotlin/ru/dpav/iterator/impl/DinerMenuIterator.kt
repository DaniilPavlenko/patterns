package ru.dpav.iterator.impl

import ru.dpav.iterator.Iterator
import ru.dpav.iterator.model.MenuItem

class DinerMenuIterator(
    private val items: Array<MenuItem?>
) : Iterator<MenuItem> {

    private var position: Int = 0

    override fun next() = requireNotNull(items[position++])

    override fun hasNext(): Boolean {
        return position < items.count() && items[position] != null
    }
}