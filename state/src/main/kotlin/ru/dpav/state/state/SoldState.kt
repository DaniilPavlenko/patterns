package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine

class SoldState(
    private val machine: GumballMachine
) : State {

    override fun insertQuarter() = println("Please wait, we're already giving you a gumball")

    override fun ejectQuarter() = println("Sorry, you already turned the crank")

    override fun turnCrank() = println("You turned, but there are no gumballs")

    override fun dispense() {
        machine.releaseBall()
        machine.state = if (machine.count > 0) {
            machine.noQuarterState
        } else {
            println("Oops, out of gumballs!")
            machine.soldOutState
        }
    }
}