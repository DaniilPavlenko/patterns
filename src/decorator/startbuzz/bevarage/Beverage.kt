package decorator.startbuzz.bevarage

abstract class Beverage {

    protected var description: String = "Unknown beverage"
        @JvmName("getDescriptionProperty")
        get

    open fun getDescription() = description

    abstract fun coast(): Double
}