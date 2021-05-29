package ru.dpav.ducksimulator.observer

class Observable(
    private val duck: QuackObservable
) : QuackObservable {

    private val observers = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers += observer
    }

    override fun notifyObservers() {
        observers.iterator().forEachRemaining { it.update(duck) }
    }
}