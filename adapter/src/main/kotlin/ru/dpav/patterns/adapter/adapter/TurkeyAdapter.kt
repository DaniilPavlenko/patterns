package ru.dpav.patterns.adapter.adapter

import ru.dpav.patterns.adapter.model.duck.Duck
import ru.dpav.patterns.adapter.model.turkey.Turkey

class TurkeyAdapter(
    private val turkey: Turkey
) : Duck {

    override fun quack() = turkey.gobble()

    override fun fly() {
        for (i in 0 until 5) {
            turkey.fly()
        }
    }
}