package ru.dpav.ducksimulator.model.duck

import ru.dpav.ducksimulator.model.Quackable
import ru.dpav.ducksimulator.observer.Observable
import ru.dpav.ducksimulator.observer.Observer

class MallardDuck : Quackable {

    private val observable = Observable(this)

    override fun quack() = println("Quack")

    override fun registerObserver(observer: Observer) = observable.registerObserver(observer)

    override fun notifyObservers() = observable.notifyObservers()

    override fun toString() = "MallardDuck"

}