package decorator.startbuzz.decorator

import decorator.startbuzz.bevarage.Beverage

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun getDescription() = beverage.getDescription() + ", Soy"

    override fun coast() = 0.15 + beverage.coast()
}