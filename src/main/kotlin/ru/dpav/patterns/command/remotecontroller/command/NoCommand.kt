package ru.dpav.patterns.command.remotecontroller.command

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command

class NoCommand : Command {

    override fun execute() {}
    override fun undo() {}
}