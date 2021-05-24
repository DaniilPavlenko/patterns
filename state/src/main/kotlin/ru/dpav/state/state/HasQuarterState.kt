package ru.dpav.state.state

import ru.dpav.state.gumballmachine.GumballMachine
import kotlin.random.Random

class HasQuarterState(
    private val machine: GumballMachine
) : State {

    private val random = Random(System.currentTimeMillis())

    override fun insertQuarter() = println("You can't insert another quarter")

    override fun ejectQuarter() {
        println("Quarter returned")
        machine.state = machine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = random.nextInt(10)
        if (winner == 0 && machine.count > 1) {
            machine.state = machine.winnerState
        } else {
            machine.state = machine.soldState
        }
    }

    override fun dispense() = println("No gumball dispensed")
}