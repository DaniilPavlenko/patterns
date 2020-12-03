package ru.dpav.patterns.decorator.startbuzz.bevarage

@Suppress("unused")
class Decaf : Beverage() {

    init {
        description = "Decaf Coffee"
    }

    override fun coast() = 1.05
}