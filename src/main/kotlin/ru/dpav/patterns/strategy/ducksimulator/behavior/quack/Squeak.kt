package ru.dpav.patterns.strategy.ducksimulator.behavior.quack

import ru.dpav.patterns.strategy.ducksimulator.behavior.QuackBehavior

@Suppress("unused")
class Squeak : QuackBehavior {

    override fun quack() {
        println("Squeak")
    }
}