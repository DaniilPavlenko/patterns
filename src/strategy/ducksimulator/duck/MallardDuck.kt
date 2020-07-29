package strategy.ducksimulator.duck

import strategy.ducksimulator.behavior.fly.FlyWithWings
import strategy.ducksimulator.behavior.quack.Quack

class MallardDuck : Duck(Quack(), FlyWithWings()) {
    override fun display() {
        println("I'm a real Mallard duck")
    }
}