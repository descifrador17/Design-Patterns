package Duck;

import DuckBehaviours.Fly.IFlyBehaviour;
import DuckBehaviours.Quack.IQuackBehaviour;

public class WildDuck extends Duck{

    public WildDuck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}
