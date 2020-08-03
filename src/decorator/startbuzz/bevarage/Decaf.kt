package decorator.startbuzz.bevarage

class Decaf : Beverage() {

    init {
        description = "Decaf Coffee"
    }

    override fun coast() = 1.05
}