package ducks

import duckBehaviours.flyingBehaviour.IFlyingBehaviour
import duckBehaviours.quackBehaviour.IQuackBehaviour

class CityDuck(val flyingBehaviour: IFlyingBehaviour, val quackBehaviour: IQuackBehaviour) : Duck(flyingBehaviour, quackBehaviour){
    override fun performFly() {
        flyingBehaviour.fly()
    }

    override fun performQuack() {
        quackBehaviour.quack()
    }
}