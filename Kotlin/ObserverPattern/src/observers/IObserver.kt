package observers

interface IObserver {
    fun updateObserver(temperature: Int, humidity: Int)
}