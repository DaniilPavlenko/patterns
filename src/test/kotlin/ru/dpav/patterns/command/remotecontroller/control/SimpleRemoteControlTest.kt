package ru.dpav.patterns.command.remotecontroller.control

import TestPrinterStream
import org.junit.Before
import org.junit.Test
import ru.dpav.patterns.command.remotecontroller.command.GarageDoorOpenCommand
import ru.dpav.patterns.command.remotecontroller.command.LightOnCommand
import ru.dpav.patterns.command.remotecontroller.receiver.GarageDoor
import ru.dpav.patterns.command.remotecontroller.receiver.Light
import kotlin.test.assertEquals

internal class SimpleRemoteControlTest {

    private val printer = TestPrinterStream()
    private lateinit var remote: SimpleRemoteControl

    @Before
    fun setupTest() {
        printer.clear()
        remote = SimpleRemoteControl()
    }

    @Test
    fun `turn on light == Light turned on`() {
        val light = Light()
        val lightOnCommand = LightOnCommand(light)
        remote.setCommand(lightOnCommand)
        printer.start()
        remote.buttonWasPressed()
        assertEquals(Light.COMMAND_ON, printer.printResults(), "The light didn't turn on!")
    }

    @Test
    fun `open garage door = Garage Door is open`() {
        val garageDoor = GarageDoor()
        remote.setCommand(GarageDoorOpenCommand(garageDoor))
        printer.start()
        remote.buttonWasPressed()
        assertEquals(GarageDoor.COMMAND_UP, printer.printResults(), "The door didn't open!")
    }

    @Test
    fun `turn on light & open garage door`() {
        val light = Light()
        val garageDoor = GarageDoor()

        val lightOnCommand = LightOnCommand(light)
        val doorOpenCommand = GarageDoorOpenCommand(garageDoor)

        printer.start()
        remote.setCommand(lightOnCommand)
        remote.buttonWasPressed()

        assertEquals(Light.COMMAND_ON, printer.printResults(), "The light didn't turn on!")
        printer.clear()

        remote.setCommand(doorOpenCommand)
        remote.buttonWasPressed()

        assertEquals(GarageDoor.COMMAND_UP, printer.printResults(), "The door didn't open!")
    }
}