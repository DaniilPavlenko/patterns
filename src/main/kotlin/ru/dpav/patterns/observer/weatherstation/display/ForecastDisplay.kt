package ru.dpav.patterns.observer.weatherstation.display

import ru.dpav.patterns.observer.weatherstation.WeatherStation
import ru.dpav.patterns.observer.weatherstation.observer.Observer
import ru.dpav.patterns.observer.weatherstation.observer.Subject

class ForecastDisplay(subject: Subject) : Observer, DisplayElement {

    private val weatherData: Subject = subject
    private var currentPressure: Float = 29.92F
    private var lastPressure: Float? = null

    init {
        weatherData.registerObserver(this)
    }

    override fun update(subject: Subject) {
        if (subject is WeatherStation) {
            lastPressure = currentPressure
            currentPressure = subject.pressure
        }
        display()
    }

    override fun display() {
        println(
            "Forecast: I received information but I cannot predict the weather yet... " +
                "but pressure is $currentPressure"
        )
    }
}