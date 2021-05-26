package observers

import observable.WeatherStation

class CurrentWeather(weatherStation: WeatherStation) : IObserver{

    var temperature: Int = 0
    var humidity: Int = 0

    init {
        weatherStation.registerObserver(this)
    }

    override fun updateObserver(temperature: Int, humidity: Int) {
        this.temperature = temperature
        this.humidity = humidity
        displayWeather()
    }

    fun displayWeather(){
        println("----------CURRENT WEATHER----------");
        println("Current Temperature -> "+ this.temperature);
        println("Current Humidity -> "+ this.humidity);
        println();
    }
}