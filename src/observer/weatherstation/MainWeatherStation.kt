package observer.weatherstation

import observer.weatherstation.display.CurrentConditionDisplay

object MainWeatherStation {

    @JvmStatic
    fun main(args: Array<String>) {
        val weatherData = WeatherData()

        val currentConditionDisplay = CurrentConditionDisplay(weatherData)

        weatherData.setMeasurement(90F, 23F, 49.6F)
        weatherData.setMeasurement(23F, 25F, 63.1F)
        weatherData.setMeasurement(15F, 62F, 43.3F)
    }
}