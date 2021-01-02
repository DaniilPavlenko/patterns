package ru.dpav.patterns.command.remotecontroller.command.impl.doors.garage

import ru.dpav.patterns.command.remotecontroller.command.Command
import ru.dpav.patterns.command.remotecontroller.commandsubject.GarageDoor

class GarageDoorOpenCommand(
    private val garageDoor: GarageDoor
) : Command {

    override fun execute() = garageDoor.up()
}