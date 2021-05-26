import duckBehaviours.flyingBehaviour.FlyHopping
import duckBehaviours.flyingBehaviour.FlyWithWings
import duckBehaviours.quackBehaviour.HighQuack
import duckBehaviours.quackBehaviour.LowQuack
import ducks.CityDuck
import ducks.WildDuck

fun main(){
    val hoppingFly = FlyHopping()
    val flyWithWings = FlyWithWings()

    val highQuack = HighQuack()
    val lowQuack = LowQuack()

    val wildDuck = WildDuck(flyWithWings, highQuack)
    val cityDuck = CityDuck(hoppingFly, lowQuack)

    println("------------WILD DUCK------------")
    wildDuck.performFly()
    wildDuck.performQuack()
    println("------------CITY DUCK------------")
    cityDuck.performFly()
    cityDuck.performQuack()
}