package decorator.startbuzz.decorator

import decorator.startbuzz.bevarage.Beverage

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun getDescription() = beverage.getDescription() + ", Mocha"

    override fun coast(): Double = 0.20 + beverage.coast()
}