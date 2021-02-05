package ru.dpav.patterns.adapter.model.turkey

class WildTurkey : Turkey {
    override fun gobble() = println("Gobble gobble")

    override fun fly() = println("I'm flying a short distance")
}