package ru.dpav.patterns.command.remotecontroller.receiver

import ru.dpav.patterns.command.remotecontroller.util.Utils.Companion.printCommand

class CeilingFan(
    val room: String
) {

    companion object {
        const val COMMAND_ON = "ceiling fan is on"
        const val COMMAND_OFF = "ceiling fan is off"
    }

    fun on() = printCommand(room, COMMAND_ON)

    fun off() = printCommand(room, COMMAND_OFF)
}