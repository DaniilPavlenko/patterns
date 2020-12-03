package ru.dpav.patterns.observer.weatherstation.observer

interface Observer {

    fun update(subject: Subject)
}