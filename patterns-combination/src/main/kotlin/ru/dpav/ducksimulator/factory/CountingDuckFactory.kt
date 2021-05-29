package ru.dpav.ducksimulator.factory

import ru.dpav.ducksimulator.decorator.QuackCounter
import ru.dpav.ducksimulator.model.duck.DuckCall
import ru.dpav.ducksimulator.model.duck.MallardDuck
import ru.dpav.ducksimulator.model.duck.RedheadDuck
import ru.dpav.ducksimulator.model.duck.RubberDuck

class CountingDuckFactory : AbstractDuckFactory() {

    override fun createMallardDuck() = QuackCounter(MallardDuck())

    override fun createRedheadDuck() = QuackCounter(RedheadDuck())

    override fun createDuckCall() = QuackCounter(DuckCall())

    override fun createRubberDuck() = QuackCounter(RubberDuck())
}