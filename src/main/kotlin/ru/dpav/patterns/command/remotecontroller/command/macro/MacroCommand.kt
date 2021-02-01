package ru.dpav.patterns.command.remotecontroller.command.macro

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command

class MacroCommand(
    private val commands: List<Command>
) : Command {

    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {
        commands.forEach { it.undo() }
    }
}