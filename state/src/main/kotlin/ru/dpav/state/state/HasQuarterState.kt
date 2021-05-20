package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine

class HasQuarterState(
    private val machine: GumballMachine
) : State {

    override fun insertQuarter() = println("You can't insert another quarter")

    override fun ejectQuarter() {
        println("Quarter returned")
        machine.state = machine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned...")
        machine.state = machine.soldState
    }

    override fun dispense() = println("No gumball dispensed")
}