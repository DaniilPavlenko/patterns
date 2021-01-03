package ru.dpav.patterns.command.remotecontroller.receiver

class GarageDoor {

    companion object {
        const val COMMAND_UP = "Garage Door is Open."
    }

    fun up() = println(COMMAND_UP)

    fun down() {}

    fun stop() {}

    fun lightOn() {}

    fun lightOff() {}
}