package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine

class NoQuarterState(
    private val machine: GumballMachine
) : State {

    override fun insertQuarter() {
        println("You inserted a quarter")
        machine.state = machine.hasQuarterState
    }

    override fun ejectQuarter() = println("You haven't inserted a quarter")

    override fun turnCrank() = println("You turned, but there is no quarter")

    override fun dispense() = println("You need to pay first")
}