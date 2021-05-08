package ru.dpav.facade.model

class Amplifier {
    lateinit var tuner: Tuner
    lateinit var dvdPlayer: DvdPlayer
    lateinit var cdPlayer: CdPlayer

    fun on() = println("Amplifier on")
    fun off() = println("Amplifier off")
    fun setStereoSound() = println("Amplifier in Stereo mode")
    fun setSurroundSound() = println("Amplifier in Surround mode")
    fun setVolume(value: Int) = println("Amplifier setting volume to $value")
}