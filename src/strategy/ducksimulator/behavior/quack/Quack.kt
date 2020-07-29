package strategy.ducksimulator.behavior.quack

import strategy.ducksimulator.behavior.QuackBehavior

class Quack : QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}