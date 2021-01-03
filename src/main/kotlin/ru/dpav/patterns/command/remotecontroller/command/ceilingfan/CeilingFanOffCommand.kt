package ru.dpav.patterns.command.remotecontroller.command.ceilingfan

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.CeilingFan

class CeilingFanOffCommand(
    private val fan: CeilingFan
) : Command {

    override fun execute() = fan.off()
}