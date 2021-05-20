package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine

class SoldOutState(
    private val machine: GumballMachine
) : State {

    override fun insertQuarter() = println("You can't insert a quarter, the machine is sold out")

    override fun ejectQuarter() = println("You can't eject, you haven't inserted a quarter yet")

    override fun turnCrank() = println("You turned, but there are no gumballs")

    override fun dispense() = println("No gumball dispensed")
}