import observable.WeatherStation
import observers.CurrentWeather
import observers.PastWeather
import java.util.*

fun main(){

    val weatherStation = WeatherStation()

    val currentWeather = CurrentWeather(weatherStation)
    val pastWeather = PastWeather(weatherStation)

    for (i in 1..5) {
        System.out.println("## Update "+i);

        var randomTemp = getRandomInt(-40, 40);
        var randomHumidity = getRandomInt(0, 100);
        if( i == 3){
            pastWeather.unregister()
        }

        weatherStation.weatherChanges(randomTemp, randomHumidity);

        Thread.sleep(1000);
    }
}


fun getRandomInt(min: Int,max: Int) : Int{
    var rand = Random()
    return rand.nextInt(max+1-min)+min;
}
