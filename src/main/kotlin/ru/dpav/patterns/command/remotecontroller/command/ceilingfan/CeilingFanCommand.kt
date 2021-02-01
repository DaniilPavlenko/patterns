package ru.dpav.patterns.command.remotecontroller.command.ceilingfan

import ru.dpav.patterns.command.remotecontroller.command.`interface`.Command
import ru.dpav.patterns.command.remotecontroller.receiver.CeilingFan

abstract class CeilingFanCommand(
    protected val fan: CeilingFan
) : Command {

    private var prevSpeed: CeilingFan.Speed? = null

    abstract fun doOnExecute()

    final override fun execute() {
        prevSpeed = fan.speed
        doOnExecute()
    }

    final override fun undo() {
        when (prevSpeed) {
            CeilingFan.Speed.LOW -> fan.turnLow()
            CeilingFan.Speed.MEDIUM -> fan.turnMedium()
            CeilingFan.Speed.HIGH -> fan.turnHigh()
            CeilingFan.Speed.OFF -> fan.off()
        }
    }
}