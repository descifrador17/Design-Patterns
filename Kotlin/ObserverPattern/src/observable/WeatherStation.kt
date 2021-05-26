package observable

import observers.IObserver

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 26-05-2021
 *   Time: 06:01 PM
 *
 */
class WeatherStation : IWeatherStation{

    private var observers = mutableListOf<IObserver>()

    private var temperature: Int = 0
    private var humidity: Int = 0


    override fun registerObserver(observer: IObserver) {
        observers.add(observer)
    }

    override fun unregisterObserver(observer: IObserver) {
        observers.remove(observer)
    }

    override fun notifyAllObservers() {
        observers.forEach { it.updateObserver(temperature, humidity) }
    }

    fun weatherChanges(temperature: Int, humidity: Int) {
        this.temperature = temperature
        this.humidity = humidity
        notifyAllObservers()
    }

}