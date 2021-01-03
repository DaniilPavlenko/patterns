package ru.dpav.patterns.command.remotecontroller.receiver

import ru.dpav.patterns.command.remotecontroller.util.Utils.Companion.printCommand

class GarageDoor(
    val room: String
) {

    companion object {
        const val COMMAND_UP = "door  is up"
        const val COMMAND_DOWN = "door is down"
    }

    fun up() = printCommand(room, COMMAND_UP)

    fun down() = printCommand(room, COMMAND_DOWN)

    fun stop() {}

    fun lightOn() {}

    fun lightOff() {}
}