package observable

import observers.IObserver
import java.util.*

interface IWeatherStation {
    fun registerObserver(observer: IObserver)

    fun unregisterObserver(observer: IObserver)

    fun notifyAllObservers()
}