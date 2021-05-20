package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine

class WinnerState(
    private val machine: GumballMachine
) : State {

    override fun insertQuarter() {
        TODO("Not yet implemented")
    }

    override fun ejectQuarter() {
        TODO("Not yet implemented")
    }

    override fun turnCrank() {
        TODO("Not yet implemented")
    }

    override fun dispense() {
        TODO("Not yet implemented")
    }
}