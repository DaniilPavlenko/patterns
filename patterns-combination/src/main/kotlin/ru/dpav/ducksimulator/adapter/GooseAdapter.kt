package ru.dpav.ducksimulator.adapter

import ru.dpav.ducksimulator.model.Goose
import ru.dpav.ducksimulator.model.Quackable
import ru.dpav.ducksimulator.observer.Observable
import ru.dpav.ducksimulator.observer.Observer

class GooseAdapter(
    private val goose: Goose
) : Quackable {

    private val observable = Observable(this)

    override fun quack() {
        goose.honk()
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) = observable.registerObserver(observer)

    override fun notifyObservers() = observable.notifyObservers()

    override fun toString() = "Goose pretending to be a Duck"
}