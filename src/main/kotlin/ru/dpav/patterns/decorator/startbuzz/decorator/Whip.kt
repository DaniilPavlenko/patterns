package ru.dpav.patterns.decorator.startbuzz.decorator

import ru.dpav.patterns.decorator.startbuzz.bevarage.Beverage

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun getDescription() = beverage.getDescription() + ", Whip"

    override fun coast() = 0.10 + beverage.coast()
}