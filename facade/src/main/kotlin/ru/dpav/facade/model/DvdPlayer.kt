package ru.dpav.facade.model

class DvdPlayer(private val amplifier: Amplifier) {
    private var movie: String? = null

    fun on() = println("DvdPlayer on")
    fun off() = println("DvdPlayer off")
    fun eject() {
        movie = null
        println("DvdPlayer eject")
    }

    fun pause() = println("DvdPlayer pause")
    fun play(movie: String) {
        this.movie = movie
        println("DvdPlayer playing \"$movie\"")
    }

    fun setSurroundAudio() = println("DvdPlayer in SurroundAudio mode")
    fun setTwoChannelAudio() = println("DvdPlayer in TwoChannelAudio mode")
    fun stop() = println("DvdPlayer stopped \"$movie\"")
}