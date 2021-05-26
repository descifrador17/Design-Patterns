package ducks

import duckBehaviours.flyingBehaviour.IFlyingBehaviour
import duckBehaviours.quackBehaviour.IQuackBehaviour

abstract class Duck(var iFlyingBehaviour: IFlyingBehaviour, var iQuackBehaviour: IQuackBehaviour) {

    abstract fun performFly()

    abstract fun performQuack()
}