package ru.dpav.patterns.command.remotecontroller.control

import TestPrinterStream
import org.junit.Before
import org.junit.Test
import ru.dpav.patterns.command.remotecontroller.command.LightOffCommand
import ru.dpav.patterns.command.remotecontroller.command.LightOnCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanHighCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanMediumCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanOffCommand
import ru.dpav.patterns.command.remotecontroller.command.macro.MacroCommand
import ru.dpav.patterns.command.remotecontroller.receiver.CeilingFan
import ru.dpav.patterns.command.remotecontroller.receiver.Light
import kotlin.test.assertTrue

internal class RemoteControlTest {

    private val printer = TestPrinterStream()

    @Before
    fun setup() {
        printer.clear()
    }

    @Test
    fun `main test`() {
        val remoteControl = RemoteControl()

        val livingRoom = "Living Room"

        val ceilingFan = CeilingFan(livingRoom)
        val fanMediumCommand = CeilingFanMediumCommand(ceilingFan)
        val fanHighCommand = CeilingFanHighCommand(ceilingFan)
        val fanOffCommand = CeilingFanOffCommand(ceilingFan)

        remoteControl.setCommand(0, fanMediumCommand, fanOffCommand)
        remoteControl.setCommand(1, fanHighCommand, fanOffCommand)

        printer.start()
        println(remoteControl)

        remoteControl.onButtonWasPressed(0)
        remoteControl.offButtonWasPressed(0)
        remoteControl.undoButtonWasPressed()

        remoteControl.onButtonWasPressed(1)
        remoteControl.undoButtonWasPressed()

        assertTrue("Remoter control info is empty.") {
            printer.printResults().isNotBlank()
        }
    }

    @Test
    fun `macro test`() {
        val remoteControl = RemoteControl()

        val roomName = "Living Room"
        val light = Light(roomName)
        val fan = CeilingFan(roomName)

        val turnOnLight = LightOnCommand(light)
        val turnOffLight = LightOffCommand(light)

        val turnMediumFan = CeilingFanMediumCommand(fan)
        val turnOffFan = CeilingFanOffCommand(fan)

        val commandsOn = listOf(turnOnLight, turnMediumFan)
        val commandsOff = listOf(turnOffLight, turnOffFan)

        val partyOn = MacroCommand(commandsOn)
        val partyOff = MacroCommand(commandsOff)

        remoteControl.setCommand(0, partyOn, partyOff)

        printer.start()
        println(remoteControl)


        remoteControl.onButtonWasPressed(0)
        remoteControl.offButtonWasPressed(0)


        assertTrue("Remoter control info is empty.") {
            printer.printResults().isNotBlank()
        }
    }
}