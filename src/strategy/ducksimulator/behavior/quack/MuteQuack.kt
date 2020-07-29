package strategy.ducksimulator.behavior.quack

import strategy.ducksimulator.behavior.QuackBehavior

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}