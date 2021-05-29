package ru.dpav.ducksimulator

import ru.dpav.ducksimulator.adapter.GooseAdapter
import ru.dpav.ducksimulator.decorator.QuackCounter
import ru.dpav.ducksimulator.factory.AbstractDuckFactory
import ru.dpav.ducksimulator.factory.CountingDuckFactory
import ru.dpav.ducksimulator.model.Flock
import ru.dpav.ducksimulator.model.Goose
import ru.dpav.ducksimulator.model.Quackable
import ru.dpav.ducksimulator.observer.Quacklogist


object DuckSimulator {

    @JvmStatic
    fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) {
        val factory = CountingDuckFactory()
        simulate(factory)
    }

    private fun simulate(duckFactory: AbstractDuckFactory) {

        val mallardDuck = duckFactory.createMallardDuck()
        val redheadDuck = duckFactory.createRedheadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        val goose = GooseAdapter(Goose())

        val flockOfDucks = Flock()

        flockOfDucks += redheadDuck
        flockOfDucks += duckCall
        flockOfDucks += rubberDuck
        flockOfDucks += goose

        val flockOfMallard = Flock().apply {
            add(duckFactory.createMallardDuck())
            add(duckFactory.createMallardDuck())
            add(duckFactory.createMallardDuck())
            add(duckFactory.createMallardDuck())
        }

        flockOfDucks += flockOfMallard

        val quacklogist = Quacklogist()
        flockOfDucks.registerObserver(quacklogist)

        println("\nDuck Simulator: Whole Flock Simulation")
        simulate(flockOfDucks)

        println("\nThe ducks quacked ${QuackCounter.numberOfQuacks} times")

        println("\nDuck Simulator: Mallard Flock Simulation")
        simulate(flockOfMallard)
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}