package ru.dpav.patterns.command.remotecontroller.command.door.garage

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.GarageDoor

class GarageDoorDownCommand(
    private val door: GarageDoor
) : Command {

    override fun execute() = door.down()
}