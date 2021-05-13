package ru.dpav.iterator.impl

import ru.dpav.iterator.model.MenuItem

class DinerMenuIterator(
    private val items: Array<MenuItem?>
) : MutableIterator<MenuItem> {

    private var position: Int = 0

    override fun next() = requireNotNull(items[position++])

    override fun hasNext(): Boolean {
        return position < items.count() && items[position] != null
    }

    override fun remove() {
        if (position <= 0) {
            error("You can't remove an item until you've done at least one next()")
        }
        if (items[position - 1] != null) {
            for (i in position - 1..items.lastIndex) {
                items[i] = items[i + 1]
            }
        }
    }
}