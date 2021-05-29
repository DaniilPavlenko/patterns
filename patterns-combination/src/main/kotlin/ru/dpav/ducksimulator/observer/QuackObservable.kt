package ru.dpav.ducksimulator.observer

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}