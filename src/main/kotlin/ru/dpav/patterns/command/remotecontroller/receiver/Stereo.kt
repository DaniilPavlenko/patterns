package ru.dpav.patterns.command.remotecontroller.receiver

import ru.dpav.patterns.command.remotecontroller.util.Utils.Companion.printCommand

class Stereo(
    val room: String
) {

    companion object {
        const val COMMAND_ON = "stereo is on"
        const val COMMAND_OFF = "stereo is off"
        const val COMMAND_SET_CD = "stereo is set for CD input"
        const val COMMAND_SET_DVD = "stereo is set for DVD input"
        const val COMMAND_SET_RADIO = "stereo is set for RADIO"
        const val COMMAND_SET_VOLUME = "stereo volume is changed"
    }

    enum class StereoMode {
        CD, DVD, RADIO
    }

    private var volume = 0
    private lateinit var mode: StereoMode

    fun on() = printCommand(room, COMMAND_ON)

    fun off() = printCommand(room, COMMAND_OFF)

    fun setCd() {
        mode = StereoMode.CD
        printCommand(room, COMMAND_SET_CD)
    }

    fun setDvd() {
        mode = StereoMode.DVD
        printCommand(room, COMMAND_SET_DVD)
    }

    fun setRadio() {
        mode = StereoMode.RADIO
        printCommand(room, COMMAND_SET_RADIO)
    }

    fun setVolume(volume: Int) {
        this.volume = volume
        printCommand(room, "$COMMAND_SET_VOLUME to $volume")
    }
}