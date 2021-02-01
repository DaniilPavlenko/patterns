package ru.dpav.patterns.command.remotecontroller.control

import ru.dpav.patterns.command.remotecontroller.command.NoCommand
import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command

class RemoteControl {

    private val onCommands = Array<Command>(7) { NoCommand() }
    private val offCommands = Array<Command>(7) { NoCommand() }
    private var undoCommand: Command = NoCommand()

    fun setCommand(slotId: Int, onCommand: Command, offCommand: Command) {
        onCommands[slotId] = onCommand
        offCommands[slotId] = offCommand
    }

    fun onButtonWasPressed(slotId: Int) =
        executeAndSaveAsPrevious(onCommands[slotId])

    fun offButtonWasPressed(slotId: Int) =
        executeAndSaveAsPrevious(offCommands[slotId])

    fun undoButtonWasPressed() {
        undoCommand.undo()
        // My addition
        undoCommand = NoCommand()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            stringBuff.append(
                "[slot $i]\t${onCommands[i].javaClass.simpleName}\t${offCommands[i].javaClass.simpleName}\n"
            )
        }
        return stringBuff.toString()
    }

    private fun executeAndSaveAsPrevious(command: Command) {
        command.execute()
        undoCommand = command
    }
}