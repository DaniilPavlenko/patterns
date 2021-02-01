package ru.dpav.patterns.command.remotecontroller.command

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.Light

class LightOffCommand(
    private val light: Light
) : Command {

    override fun execute() = light.off()

    override fun undo() = light.on()
}