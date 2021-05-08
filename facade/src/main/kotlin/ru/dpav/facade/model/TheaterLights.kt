package ru.dpav.facade.model

class TheaterLights {
    fun on() = println("Theater Lights on")
    fun off() = println("TheaterLights off")
    fun dim(value: Int) = println("Theater Lights dimming to $value%")
}