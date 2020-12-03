package ru.dpav.patterns.strategy.ducksimulator.behavior.quack

import ru.dpav.patterns.strategy.ducksimulator.behavior.QuackBehavior

@Suppress("unused")
class MuteQuack : QuackBehavior {

    override fun quack() {
        println("<< Silence >>")
    }
}