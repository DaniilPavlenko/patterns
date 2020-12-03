package ru.dpav.patterns.decorator.startbuzz.bevarage

class HouseBlend : Beverage() {

    init {
        description = "House Blend Coffee"
    }

    override fun coast() = 0.89
}