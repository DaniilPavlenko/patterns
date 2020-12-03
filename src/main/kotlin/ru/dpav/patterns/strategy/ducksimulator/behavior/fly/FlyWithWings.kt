package ru.dpav.patterns.strategy.ducksimulator.behavior.fly

import ru.dpav.patterns.strategy.ducksimulator.behavior.FlyBehavior

class FlyWithWings : FlyBehavior {

    override fun fly() {
        println("I'm flying!!!")
    }
}