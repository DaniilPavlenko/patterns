package ru.dpav.ducksimulator.model

import ru.dpav.ducksimulator.observer.QuackObservable

interface Quackable : QuackObservable {
    fun quack()
}