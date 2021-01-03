package ru.dpav.patterns.command.remotecontroller.control

import ru.dpav.patterns.command.remotecontroller.command.NoCommand
import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command

class RemoteControl {

    private val onCommands = Array<Command>(7) { NoCommand() }
    private val offCommands = Array<Command>(7) { NoCommand() }

    fun setCommand(slotId: Int, onCommand: Command, offCommand: Command) {
        onCommands[slotId] = onCommand
        offCommands[slotId] = offCommand
    }

    fun onButtonWasPressed(slotId: Int) {
        onCommands[slotId].execute()
    }

    fun offButtonWasPressed(slotId: Int) {
        offCommands[slotId].execute()
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
}