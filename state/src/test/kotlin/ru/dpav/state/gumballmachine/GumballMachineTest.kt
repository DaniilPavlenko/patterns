package ru.dpav.state.gumballmachine

import org.junit.jupiter.api.Test

internal class GumballMachineTest {

    @Test
    fun test() {
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

    private fun printWithVerticalMargin(machine: GumballMachine) {
        println()
        println(machine.state)
        println()
    }
}