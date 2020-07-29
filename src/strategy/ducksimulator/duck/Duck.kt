package strategy.ducksimulator.duck

import strategy.ducksimulator.behavior.FlyBehavior
import strategy.ducksimulator.behavior.QuackBehavior

abstract class Duck(
        var quackBehavior: QuackBehavior,
        var flyBehavior: FlyBehavior
) {

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }
}