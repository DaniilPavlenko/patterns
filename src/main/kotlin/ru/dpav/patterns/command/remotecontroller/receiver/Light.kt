package ru.dpav.patterns.command.remotecontroller.receiver

import ru.dpav.patterns.command.remotecontroller.util.Utils.Companion.printCommand

class Light(
    val room: String
) {

    companion object {
        const val COMMAND_ON = "light is on"
        const val COMMAND_OFF = "light is off"
    }

    fun on() = printCommand(room, COMMAND_ON)

    fun off() = printCommand(room, COMMAND_OFF)
}