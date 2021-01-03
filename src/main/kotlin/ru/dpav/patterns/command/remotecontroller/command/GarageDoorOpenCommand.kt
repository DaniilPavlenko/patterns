package ru.dpav.patterns.command.remotecontroller.command

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.GarageDoor

class GarageDoorOpenCommand(
    private val garageDoor: GarageDoor
) : Command {

    override fun execute() = garageDoor.up()
}