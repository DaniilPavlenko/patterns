package strategy.ducksimulator.behavior.fly

import strategy.ducksimulator.behavior.FlyBehavior

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}