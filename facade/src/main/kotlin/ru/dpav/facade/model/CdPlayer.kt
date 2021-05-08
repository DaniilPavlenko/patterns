package ru.dpav.facade.model

class CdPlayer(private val amplifier: Amplifier) {
    var disk: String? = null

    fun on() = println("CdPlayer on")
    fun off() = println("CdPlayer off")
    fun eject() {
        disk = null
        println("CdPlayer eject")
    }

    fun pause() = println("CdPlayer pause")
    fun play(disk: String) {
        this.disk = disk
        println("CdPlayer play \"$disk\"")
    }

    fun setSurroundAudio() = println("CdPlayer in SurroundAudio mode")
    fun setTwoChannelAudio() = println("CdPlayer in TwoChannelAudio mode")
    fun stop() = println("CdPlayer stop \"$disk\"")
}