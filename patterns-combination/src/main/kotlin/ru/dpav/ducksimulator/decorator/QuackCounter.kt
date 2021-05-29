package ru.dpav.ducksimulator.decorator

import ru.dpav.ducksimulator.model.Quackable
import ru.dpav.ducksimulator.observer.Observer

class QuackCounter(
    private val duck: Quackable
) : Quackable {

    override fun quack() {
        duck.quack()
        notifyObservers()
        numberOfQuacks++
    }

    override fun registerObserver(observer: Observer) = duck.registerObserver(observer)

    override fun notifyObservers() = duck.notifyObservers()

    companion object {
        @JvmStatic
        var numberOfQuacks = 0
            private set
    }
}