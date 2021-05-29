package ru.dpav.ducksimulator.observer

class Quacklogist : Observer {
    override fun update(duck: QuackObservable) {
        println("Quacklogist: $duck just quacked.")
    }
}