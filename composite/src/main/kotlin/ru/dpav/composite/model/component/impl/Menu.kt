package ru.dpav.composite.model.component.impl

import ru.dpav.composite.model.component.MenuComponent

class Menu(
    private val name: String,
    private val description: String
) : MenuComponent() {

    private val menuComponents: MutableList<MenuComponent> = arrayListOf()

    override fun add(component: MenuComponent) {
        menuComponents += component
    }

    override fun remove(component: MenuComponent) {
        menuComponents -= component
    }

    override fun getChild(position: Int): MenuComponent {
        return menuComponents[position]
    }

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun print() {
        println("\n${getName()}, ${getDescription()}\n----------")
        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            iterator.next().print()
        }
    }
}