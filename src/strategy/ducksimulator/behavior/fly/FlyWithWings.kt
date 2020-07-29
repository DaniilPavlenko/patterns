package strategy.ducksimulator.behavior.fly

import strategy.ducksimulator.behavior.FlyBehavior

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I'm flying!!!")
    }
}