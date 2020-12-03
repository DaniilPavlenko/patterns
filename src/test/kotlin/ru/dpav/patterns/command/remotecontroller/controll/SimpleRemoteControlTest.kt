package ru.dpav.patterns.command.remotecontroller.controll

import TestPrinterStream
import org.junit.Test
import org.junit.jupiter.api.BeforeEach
import ru.dpav.patterns.command.remotecontroller.command.impl.Light
import ru.dpav.patterns.command.remotecontroller.command.impl.LightOnCommand
import kotlin.test.assertEquals

internal class SimpleRemoteControlTest {

    private val printer = TestPrinterStream()

    @BeforeEach
    fun setupTest() {
        printer.clear()
    }

    @Test
    fun `turn on light == Light turned on`() {
        val remote = SimpleRemoteControl()
        val light = Light()
        val lightOnCommand = LightOnCommand(light)
        remote.setCommand(lightOnCommand)
        printer.start()

        remote.buttonWasPressed()

        assertEquals("Light turned on", printer.printResults(), "The light didn't turn on!")
    }
}