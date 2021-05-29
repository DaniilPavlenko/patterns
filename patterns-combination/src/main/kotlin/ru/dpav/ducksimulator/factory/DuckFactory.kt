package ru.dpav.ducksimulator.factory

import ru.dpav.ducksimulator.model.duck.DuckCall
import ru.dpav.ducksimulator.model.duck.MallardDuck
import ru.dpav.ducksimulator.model.duck.RedheadDuck
import ru.dpav.ducksimulator.model.duck.RubberDuck

class DuckFactory : AbstractDuckFactory() {

    override fun createMallardDuck() = MallardDuck()

    override fun createRedheadDuck() = RedheadDuck()

    override fun createDuckCall() = DuckCall()

    override fun createRubberDuck() = RubberDuck()
}