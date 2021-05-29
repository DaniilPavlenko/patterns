package ru.dpav.ducksimulator.model

import ru.dpav.ducksimulator.observer.Observer

class Flock : Quackable {

    private val ducks = mutableListOf<Quackable>()

    override fun quack() {
        ducks.iterator().forEachRemaining { it.quack() }
    }

    fun add(duck: Quackable) {
        ducks += duck
    }

    override fun registerObserver(observer: Observer) {
        ducks.iterator().forEachRemaining { it.registerObserver(observer) }
    }

    override fun notifyObservers() {}

    operator fun plusAssign(duck: Quackable) = add(duck)
}