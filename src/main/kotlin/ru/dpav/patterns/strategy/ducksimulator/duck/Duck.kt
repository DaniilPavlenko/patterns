package ru.dpav.patterns.strategy.ducksimulator.duck

import ru.dpav.patterns.strategy.ducksimulator.behavior.FlyBehavior
import ru.dpav.patterns.strategy.ducksimulator.behavior.QuackBehavior

abstract class Duck(
    private var quackBehavior: QuackBehavior,
    private var flyBehavior: FlyBehavior
) {

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    @Suppress("unused")
    fun swim() {
        println("All ducks float, even decoys!")
    }
}