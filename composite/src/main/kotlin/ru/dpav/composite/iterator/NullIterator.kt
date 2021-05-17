package ru.dpav.composite.iterator

import ru.dpav.composite.model.component.MenuComponent

class NullIterator : Iterator<MenuComponent> {
    override fun hasNext() = false

    override fun next(): MenuComponent {
        throw IndexOutOfBoundsException("Iterator doesn't have a next element")
    }
}