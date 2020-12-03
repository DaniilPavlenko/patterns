package ru.dpav.patterns.observer.weatherstation

import ru.dpav.patterns.observer.weatherstation.display.CurrentConditionDisplay
import ru.dpav.patterns.observer.weatherstation.display.ForecastDisplay

object MainWeatherStation {

    @JvmStatic
    fun main(args: Array<String>) {
        val weatherData = WeatherData()

        @Suppress("UNUSED_VARIABLE")
        val currentConditionDisplay = CurrentConditionDisplay(weatherData)
        @Suppress("UNUSED_VARIABLE")
        val forecastDisplay = ForecastDisplay(weatherData)

        weatherData.setMeasurement(90F, 23F, 49.6F)
        weatherData.setMeasurement(23F, 25F, 63.1F)
        weatherData.setMeasurement(15F, 62F, 43.3F)
    }
}