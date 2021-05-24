package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine

class WinnerState(
    private val machine: GumballMachine
) : State {

    override fun insertQuarter() = println("Please wait, we're already giving you a gumball")

    override fun ejectQuarter() = println("Sorry, you already turned the crank")

    override fun turnCrank() = println("You turned, but there are no gumballs")

    override fun dispense() {
        println("YOU ARE A WINNER! You get two gumballs for your quarter")
        machine.releaseBall()
        if (machine.count == 0) {
            machine.state = machine.soldOutState
        } else {
            machine.releaseBall()
            if (machine.count > 0) {
                machine.state = machine.noQuarterState
            } else {
                println("Oops, out of gumballs")
                machine.state = machine.soldOutState
            }
        }
    }
}