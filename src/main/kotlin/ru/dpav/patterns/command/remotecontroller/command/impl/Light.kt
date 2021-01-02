package ru.dpav.patterns.command.remotecontroller.command.impl

class Light {

    companion object {
        const val COMMAND_ON = "Light turned on"
    }

    fun on() = println(COMMAND_ON)
    fun off() = println("Light turned off")
}