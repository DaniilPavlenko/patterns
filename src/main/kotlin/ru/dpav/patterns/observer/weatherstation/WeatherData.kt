package ru.dpav.patterns.observer.weatherstation

import ru.dpav.patterns.observer.weatherstation.observer.Observer
import ru.dpav.patterns.observer.weatherstation.observer.Subject

class WeatherData : WeatherStation, Subject {

    private val observers = arrayListOf<Observer>()
    override var temperature = 0.0F
    override var humidity = 0.0F
    override var pressure = 0.0F

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(this)
        }
    }

    fun setMeasurement(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    private fun measurementsChanged() = notifyObservers()
}