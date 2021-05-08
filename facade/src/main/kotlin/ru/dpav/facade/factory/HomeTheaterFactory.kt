package ru.dpav.facade.factory

import ru.dpav.facade.facade.HomeTheaterFacade
import ru.dpav.facade.model.*

class HomeTheaterFactory {
    companion object {
        fun createFacade(): HomeTheaterFacade {
            val amplifier = Amplifier()
            val tuner = Tuner()
            val dvdPlayer = DvdPlayer(amplifier)
            val cdPlayer = CdPlayer(amplifier)
            val projector = Projector(dvdPlayer)
            val lights = TheaterLights()
            val screen = Screen()
            val popper = PopcornPopper()
            return HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, lights, screen, popper)
        }
    }
}