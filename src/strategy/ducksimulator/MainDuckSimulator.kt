package strategy.ducksimulator

import strategy.ducksimulator.duck.MallardDuck

object MainDuckSimulator {

    @JvmStatic
    fun main(args: Array<String>) {
        val mallard = MallardDuck()
        mallard.performQuack()
        mallard.performFly()
    }
}