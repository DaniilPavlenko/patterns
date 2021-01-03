package ru.dpav.patterns.command.remotecontroller.util

class Utils {
    companion object {
        fun printCommand(room: String? = null, command: String) =
            println("$room $command")
    }
}