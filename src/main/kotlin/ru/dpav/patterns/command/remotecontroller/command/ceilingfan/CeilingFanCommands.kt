package ru.dpav.patterns.command.remotecontroller.command.ceilingfan

import ru.dpav.patterns.command.remotecontroller.receiver.CeilingFan

class CeilingFanHighCommand(fan: CeilingFan) : CeilingFanCommand(fan) {
    override fun doOnExecute() = fan.turnHigh()
}

class CeilingFanMediumCommand(fan: CeilingFan) : CeilingFanCommand(fan) {
    override fun doOnExecute() = fan.turnMedium()
}

class CeilingFanLowCommand(fan: CeilingFan) : CeilingFanCommand(fan) {
    override fun doOnExecute() = fan.turnLow()
}

class CeilingFanOffCommand(fan: CeilingFan) : CeilingFanCommand(fan) {
    override fun doOnExecute() = fan.off()
}