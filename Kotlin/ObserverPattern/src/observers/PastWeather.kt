package observers

import observable.IWeatherStation
import observable.WeatherStation

class PastWeather(weatherStation: WeatherStation) : IObserver {

    lateinit var wStation: IWeatherStation
    init {
        this.wStation = weatherStation
        weatherStation.registerObserver(this)
    }

    var pastTemperatures = mutableListOf<Int>()
    var pastHumidity = mutableListOf<Int>()

    override fun updateObserver(temperature: Int, humidity: Int) {
        this.pastTemperatures.add(temperature)
        this.pastHumidity.add(humidity)
        displayPastTemperatures()
    }

    fun displayPastTemperatures() {
        println("----------PAST WEATHER----------")
        println("Current Temperature -> " + pastTemperatures.subList(Math.max(pastTemperatures.size - 7, 0), pastTemperatures.size))
        println("Current Humidity -> " + pastHumidity.subList(Math.max(pastHumidity.size - 7, 0), pastHumidity.size))
    }

    fun unregister(){
        wStation.unregisterObserver(this)
    }

}