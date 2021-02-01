package ru.dpav.patterns.command.remotecontroller.command.stereo

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.Stereo

class StereoOffCommand(
    private val stereo: Stereo
) : Command {

    override fun execute() = stereo.off()

    override fun undo() = stereo.on()
}