package ru.dpav.facade.facade

import org.junit.jupiter.api.Test
import ru.dpav.facade.factory.HomeTheaterFactory

class HomeTheaterFacadeTest {

    @Test
    fun test() {
        with(HomeTheaterFactory.createFacade()) {
            watchMovie("Raiders of the Lost Ark")
            endMovie()
        }
    }
}