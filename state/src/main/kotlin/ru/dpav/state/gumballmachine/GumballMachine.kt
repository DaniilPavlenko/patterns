package ru.dpav.state.gumballmachine

import ru.dpav.state.state.*

class GumballMachine(count: Int) {

    val soldOutState = SoldOutState(this)
    val noQuarterState = NoQuarterState(this)
    val hasQuarterState = HasQuarterState(this)
    val soldState = SoldState(this)

    var state: State = soldOutState
    var count: Int = count
        private set

    init {
        if (this.count > 0) {
            state = noQuarterState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot")
        if (count > 0) {
            count--
        }
    }
}