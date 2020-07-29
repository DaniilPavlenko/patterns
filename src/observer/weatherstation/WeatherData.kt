package observer.weatherstation

import observer.weatherstation.observer.Observer
import observer.weatherstation.observer.Subject

class WeatherData : Subject {

    private val observers = arrayListOf<Observer>()
    private var temperature = 0.0F
    private var humidity = 0.0F
    private var pressure = 0.0F

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
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