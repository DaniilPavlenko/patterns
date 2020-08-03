package decorator.startbuzz.decorator

import decorator.startbuzz.bevarage.Beverage

abstract class CondimentDecorator(protected val beverage: Beverage) : Beverage() {

    abstract override fun getDescription(): String
}