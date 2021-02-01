package ru.dpav.patterns.command.remotecontroller.command.door.garage

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.GarageDoor

class GarageDoorUpCommand(
    private val garageDoor: GarageDoor
) : Command {

    override fun execute() = garageDoor.up()

    override fun undo() = garageDoor.down()
}