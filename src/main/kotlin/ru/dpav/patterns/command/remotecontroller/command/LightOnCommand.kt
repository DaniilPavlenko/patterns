package ru.dpav.patterns.command.remotecontroller.command

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.Light

class LightOnCommand(
    private val light: Light
) : Command {

    override fun execute() {
        light.on()
    }
}