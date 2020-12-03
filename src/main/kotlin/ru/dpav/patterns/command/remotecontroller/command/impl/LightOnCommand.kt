package ru.dpav.patterns.command.remotecontroller.command.impl

import ru.dpav.patterns.command.remotecontroller.command.Command

class LightOnCommand(
    private val light: Light
) : Command {

    override fun execute() {
        light.on()
    }
}