package ru.dpav.patterns.command.remotecontroller.command.stereo

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.Stereo

class StereoOnWithRadioCommand(
    private val stereo: Stereo
) : Command {

    override fun execute() {
        stereo.on()
        stereo.setRadio()
        stereo.setVolume(11)
    }

    override fun undo() = stereo.off()
}