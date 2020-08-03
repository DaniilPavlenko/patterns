package decorator.startbuzz.bevarage

class Espresso : Beverage() {

    init {
        description = "Espresso"
    }

    override fun coast() = 1.99
}