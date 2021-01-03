package ru.dpav.patterns.command.remotecontroller.control

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command

class SimpleRemoteControl {

    private var slot: Command? = null

    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonWasPressed() {
        slot?.execute()
    }
}