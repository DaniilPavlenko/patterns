package ru.dpav.patterns.command.remotecontroller.control

import TestPrinterStream
import org.junit.Before
import org.junit.Test
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanHighCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanMediumCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanOffCommand
import ru.dpav.patterns.command.remotecontroller.receiver.CeilingFan
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
}