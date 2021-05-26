package ducks

import duckBehaviours.flyingBehaviour.IFlyingBehaviour
import duckBehaviours.quackBehaviour.IQuackBehaviour

class WildDuck(private val flyingBehaviour: IFlyingBehaviour, private val quackBehaviour: IQuackBehaviour) : Duck(flyingBehaviour,quackBehaviour) {

    override fun performFly(){
        flyingBehaviour.fly()
    }

    override fun performQuack() {
        quackBehaviour.quack()
    }
}