package ru.dpav.patterns.observer.weatherstation.observer

interface Subject {

    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}