package ru.dpav.patterns.decorator.startbuzz.bevarage

class DarkRoast : Beverage() {

    init {
        description = "Dark Roast Coffee"
    }

    override fun coast() = 0.99
}