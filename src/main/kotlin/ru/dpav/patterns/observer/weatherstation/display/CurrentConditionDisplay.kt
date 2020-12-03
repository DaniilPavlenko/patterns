package ru.dpav.patterns.observer.weatherstation.display

import ru.dpav.patterns.observer.weatherstation.WeatherStation
import ru.dpav.patterns.observer.weatherstation.observer.Observer
import ru.dpav.patterns.observer.weatherstation.observer.Subject

class CurrentConditionDisplay(subject: Subject) : Observer, DisplayElement {

    private var temperature = 0F
    private var humidity = 0F
    private val weatherData: Subject = subject

    init {
        weatherData.registerObserver(this)
    }

    override fun update(subject: Subject) {
        if (subject is WeatherStation) {
            this.temperature = subject.temperature
            this.humidity = subject.humidity
            display()
        }
    }

    override fun display() {
        println("Current condition: ${temperature}F degrees & ${humidity}% humidity.")
    }
}