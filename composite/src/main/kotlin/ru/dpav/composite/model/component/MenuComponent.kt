package ru.dpav.composite.model.component

abstract class MenuComponent {
    open fun add(component: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(component: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(position: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun getName(): String {
        throw UnsupportedOperationException()
    }

    open fun getDescription(): String {
        throw UnsupportedOperationException()
    }

    open fun getPrice(): Double {
        throw UnsupportedOperationException()
    }

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

    open fun createIterator(): Iterator<MenuComponent> {
        throw UnsupportedOperationException()
    }
}