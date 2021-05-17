package ru.dpav.composite.iterator

import ru.dpav.composite.model.component.MenuComponent
import ru.dpav.composite.model.component.impl.Menu
import java.util.*

class CompositeIterator(
    iterator: Iterator<MenuComponent>
) : Iterator<MenuComponent> {

    private val stack = Stack<Iterator<MenuComponent>>()

    init {
        stack.push(iterator)
    }

    override fun next(): MenuComponent {
        if (hasNext()) {
            val iterator = stack.peek()
            val component = iterator.next()
            if (component is Menu) {
                stack.push(component.createIterator())
            }
            return component
        }
        throw IndexOutOfBoundsException("Iterator doesn't have a next element.")
    }

    override fun hasNext(): Boolean {
        return if (stack.isEmpty()) {
            false
        } else {
            val iterator = stack.peek()
            if (!iterator.hasNext()) {
                stack.pop()
                hasNext()
            } else {
                true
            }
        }
    }
}