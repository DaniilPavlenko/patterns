package ru.dpav.facade.model

class Tuner {
    fun on() = println("Tuner on")
    fun off() = println("Tuner off")
    fun setAm() = println("Tuner in AM mode")
    fun setFm() = println("Tuner in FM mode")
    fun setFrequency(value: Int) = println("Tuner setting frequency to $value")
}