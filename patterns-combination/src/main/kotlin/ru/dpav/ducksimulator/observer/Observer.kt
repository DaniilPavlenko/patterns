package ru.dpav.ducksimulator.observer

interface Observer {
    fun update(duck: QuackObservable)
}