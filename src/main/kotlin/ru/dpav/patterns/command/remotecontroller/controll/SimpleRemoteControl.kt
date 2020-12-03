package ru.dpav.patterns.command.remotecontroller.controll

import ru.dpav.patterns.command.remotecontroller.command.Command

class SimpleRemoteControl {

    private var slot: Command? = null

    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonWasPressed() {
        slot?.execute()
    }
}