package ru.dpav.facade.model

class Projector(
    private val dvdPlayer: DvdPlayer
) {
    fun on() = println("Projector on")
    fun off() = println("Projector off")
    fun tvMode() = println("Projector in TV mode")
    fun wideScreenMode() = println("Projector in WideScreen mode")
}