package strategy.ducksimulator.behavior.quack

import strategy.ducksimulator.behavior.QuackBehavior

class Squeak : QuackBehavior {
    override fun quack() {
        println("Squeak")
    }
}