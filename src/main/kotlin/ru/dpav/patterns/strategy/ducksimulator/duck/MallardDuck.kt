package ru.dpav.patterns.strategy.ducksimulator.duck

import ru.dpav.patterns.strategy.ducksimulator.behavior.fly.FlyWithWings
import ru.dpav.patterns.strategy.ducksimulator.behavior.quack.Quack

class MallardDuck : Duck(Quack(), FlyWithWings()) {

    override fun display() {
        println("I'm a real Mallard duck")
    }
}