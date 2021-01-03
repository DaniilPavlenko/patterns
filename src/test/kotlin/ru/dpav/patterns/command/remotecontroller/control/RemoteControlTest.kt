package ru.dpav.patterns.command.remotecontroller.control

import TestPrinterStream
import org.junit.Before
import org.junit.Test
import ru.dpav.patterns.command.remotecontroller.command.LightOffCommand
import ru.dpav.patterns.command.remotecontroller.command.LightOnCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanOffCommand
import ru.dpav.patterns.command.remotecontroller.command.ceilingfan.CeilingFanOnCommand
import ru.dpav.patterns.command.remotecontroller.command.door.garage.GarageDoorDownCommand
import ru.dpav.patterns.command.remotecontroller.command.door.garage.GarageDoorUpCommand
import ru.dpav.patterns.command.remotecontroller.command.stereo.StereoOffCommand
import ru.dpav.patterns.command.remotecontroller.command.stereo.StereoOnWithCdCommand
import ru.dpav.patterns.command.remotecontroller.receiver.CeilingFan
import ru.dpav.patterns.command.remotecontroller.receiver.GarageDoor
import ru.dpav.patterns.command.remotecontroller.receiver.Light
import ru.dpav.patterns.command.remotecontroller.receiver.Stereo
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

        val livingRoomLight = Light(livingRoom)
        val kitchenLight = Light("Kitchen")

        val ceilingFan = CeilingFan(livingRoom)

        val garageDoor = GarageDoor("")
        val stereo = Stereo(livingRoom)

        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)

        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)

        val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        val garageDoorUp = GarageDoorUpCommand(garageDoor)
        val garageDoorDown = GarageDoorDownCommand(garageDoor)

        val stereoOnWithCd = StereoOnWithCdCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff)
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff)

        printer.start()
        println(remoteControl)

        assertTrue("Remoter control info is empty.") {
            printer.printResults().isNotBlank()
        }

        for (i in 0..3) {
            remoteControl.onButtonWasPressed(i)
            remoteControl.offButtonWasPressed(i)
        }
    }
}