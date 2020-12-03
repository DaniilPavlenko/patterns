package ru.dpav.patterns.decorator.startbuzz

import ru.dpav.patterns.decorator.startbuzz.bevarage.Beverage
import ru.dpav.patterns.decorator.startbuzz.bevarage.DarkRoast
import ru.dpav.patterns.decorator.startbuzz.bevarage.Espresso
import ru.dpav.patterns.decorator.startbuzz.bevarage.HouseBlend
import ru.dpav.patterns.decorator.startbuzz.decorator.Mocha
import ru.dpav.patterns.decorator.startbuzz.decorator.Soy
import ru.dpav.patterns.decorator.startbuzz.decorator.Whip

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val beverage: Beverage = Espresso()
        beverage.print()

        var beverage2: Beverage = DarkRoast()
        beverage2 = Mocha(beverage2)
        beverage2 = Mocha(beverage2)
        beverage2 = Whip(beverage2)
        beverage2.print()

        var beverage3: Beverage = HouseBlend()
        beverage3 = Soy(beverage3)
        beverage3 = Mocha(beverage3)
        beverage3 = Whip(beverage3)
        beverage3.print()
    }

    private fun Beverage.print() = println(getDescription() + " $" + coast())
}