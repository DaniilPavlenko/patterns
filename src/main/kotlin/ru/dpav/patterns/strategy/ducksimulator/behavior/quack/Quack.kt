package ru.dpav.patterns.strategy.ducksimulator.behavior.quack

import ru.dpav.patterns.strategy.ducksimulator.behavior.QuackBehavior

class Quack : QuackBehavior {

    override fun quack() {
        println("Quack")
    }
}