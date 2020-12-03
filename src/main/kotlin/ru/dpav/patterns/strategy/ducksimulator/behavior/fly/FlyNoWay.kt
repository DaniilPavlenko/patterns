package ru.dpav.patterns.strategy.ducksimulator.behavior.fly

import ru.dpav.patterns.strategy.ducksimulator.behavior.FlyBehavior

@Suppress("unused")
class FlyNoWay : FlyBehavior {

    override fun fly() {
        println("I can't fly")
    }
}