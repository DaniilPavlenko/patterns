package ru.dpav.patterns.decorator.startbuzz.decorator

import ru.dpav.patterns.decorator.startbuzz.bevarage.Beverage

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun getDescription() = beverage.getDescription() + ", Mocha"

    override fun coast(): Double = 0.20 + beverage.coast()
}