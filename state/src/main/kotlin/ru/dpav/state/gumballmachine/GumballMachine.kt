package ru.dpav.state.gumballmachine

import ru.dpav.state.gumballmachine.GumballMachine.State.*

class GumballMachine(
    private var count: Int
) {

    private var state: State = SOLD_OUT

    init {
        if (count > 0) {
            state = NO_QUARTER
        }
    }

    fun insertQuarter() {
        when (state) {
            SOLD_OUT -> println("You can't insert a quarter, the machine is sold out")

            NO_QUARTER -> {
                state = HAS_QUARTER
                println("You inserted a quarter")
            }

            HAS_QUARTER -> println("You can't insert another quarter")
            SOLD -> println("Please wait, we're already giving you a gumball")
        }
    }

    fun ejectQuarter() {
        when (state) {
            SOLD_OUT -> println("You can't eject, you haven't inserted a quarter yet")
            NO_QUARTER -> println("You haven't inserted a quarter")

            HAS_QUARTER -> {
                state = NO_QUARTER
                println("Quarter returned")
            }

            SOLD -> println("Sorry, you already turned the crank")
        }
    }

    fun turnCrank() {
        when (state) {
            SOLD_OUT -> println("You turned, but there are no gumballs")
            NO_QUARTER -> println("You turned, but there is no quarter")

            HAS_QUARTER -> {
                println("You turned...")
                state = SOLD
                dispense()
            }

            SOLD -> TODO()
        }
    }

    fun dispense() {
        when (state) {
            SOLD_OUT -> println("No gumball dispensed")
            NO_QUARTER -> println("You need to pay first")
            HAS_QUARTER -> println("No gumball dispensed")

            SOLD -> {
                println("A gumball comes rolling out the slot")
                count--
                state = if (count == 0) {
                    println("Oops, out of gumballs!")
                    SOLD_OUT
                } else {
                    NO_QUARTER
                }
            }
        }
    }

    override fun toString(): String {
        return """Mighty Gumball, Inc.
        |Java-enabled Standing Gumball Model #2004
        |Inventory: $count gumballs
        |State = ${state.name}""".trimMargin()
    }

    enum class State {
        SOLD_OUT, NO_QUARTER, HAS_QUARTER, SOLD
    }
}