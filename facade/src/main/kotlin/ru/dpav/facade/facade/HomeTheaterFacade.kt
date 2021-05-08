package ru.dpav.facade.facade

import ru.dpav.facade.model.*

class HomeTheaterFacade(
    var amplifier: Amplifier,
    var tuner: Tuner,
    var dvdPlayer: DvdPlayer,
    var cdPlayer: CdPlayer,
    var projector: Projector,
    var lights: TheaterLights,
    var screen: Screen,
    var popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        with(amplifier) {
            on()
            dvdPlayer = this@HomeTheaterFacade.dvdPlayer
            setVolume(5)
        }
        with(dvdPlayer) {
            on()
            play(movie)
        }
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amplifier.off()
        with(dvdPlayer) {
            stop()
            eject()
            off()
        }
    }

    fun listenToCd(): Nothing = TODO()
    fun endCd(): Nothing = TODO()
    fun listenToRadio(): Nothing = TODO()
    fun endRadio(): Nothing = TODO()

}