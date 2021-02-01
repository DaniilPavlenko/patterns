package ru.dpav.patterns.command.remotecontroller.receiver

import ru.dpav.patterns.command.remotecontroller.util.Utils.Companion.printCommand

class CeilingFan(
    val room: String
) {

    companion object {
        val COMMAND_HIGH = "ceiling fan is ${Speed.HIGH.name}"
        val COMMAND_MEDIUM = "ceiling fan is ${Speed.MEDIUM.name}"
        val COMMAND_LOW = "ceiling fan is ${Speed.LOW.name}"
        val COMMAND_OFF = "ceiling fan is ${Speed.OFF.name}"
    }

    enum class Speed {
        HIGH, MEDIUM, LOW, OFF
    }

    var speed: Speed = Speed.OFF
        private set

    fun turnHigh() {
        speed = Speed.HIGH
        printCommand(room, COMMAND_HIGH)
    }

    fun turnMedium() {
        speed = Speed.MEDIUM
        printCommand(room, COMMAND_MEDIUM)
    }

    fun turnLow() {
        speed = Speed.LOW
        printCommand(room, COMMAND_LOW)
    }

    fun off() = printCommand(room, COMMAND_OFF)
}