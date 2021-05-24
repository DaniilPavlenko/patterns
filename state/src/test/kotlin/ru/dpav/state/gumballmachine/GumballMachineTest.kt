package ru.dpav.state.gumballmachine

import org.junit.jupiter.api.Test

internal class GumballMachineTest {

    @Test
    fun justTest() {
        val machine = GumballMachine(5)

        with(machine) {
            printWithVerticalMargin(this)

            insertQuarter()
            turnCrank()

            printWithVerticalMargin(this)

            insertQuarter()
            ejectQuarter()
            turnCrank()

            printWithVerticalMargin(this)

            insertQuarter()
            turnCrank()
            insertQuarter()
            turnCrank()
            ejectQuarter()

            printWithVerticalMargin(this)

            insertQuarter()
            insertQuarter()
            turnCrank()
            insertQuarter()
            turnCrank()
            insertQuarter()
            turnCrank()

            printWithVerticalMargin(this)
        }
    }

    @Test
    fun winnerTest() {
        val machine = GumballMachine(10)
        printWithVerticalMargin(machine)
        for (i in 0 until 10) {
            buyGumball(machine)
        }
    }

    private fun buyGumball(machine: GumballMachine) {
        machine.insertQuarter()
        machine.turnCrank()
        printWithVerticalMargin(machine)
    }

    private fun printWithVerticalMargin(machine: GumballMachine) {
        println()
        println(machine.state)
        println()
    }
}