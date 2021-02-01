package ru.dpav.patterns.command.remotecontroller.command.stereo

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.Stereo

class StereoOnWithCdCommand(
    private val stereo: Stereo
) : Command {

    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(11)
    }

    override fun undo() = stereo.off()
}