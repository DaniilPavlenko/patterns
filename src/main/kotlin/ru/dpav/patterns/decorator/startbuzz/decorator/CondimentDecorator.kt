package ru.dpav.patterns.decorator.startbuzz.decorator

import ru.dpav.patterns.decorator.startbuzz.bevarage.Beverage

abstract class CondimentDecorator(protected val beverage: Beverage) : Beverage() {

    abstract override fun getDescription(): String
}