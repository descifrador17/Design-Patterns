package Duck;

import DuckBehaviours.Fly.IFlyBehaviour;
import DuckBehaviours.Quack.IQuackBehaviour;

public abstract class Duck {
    protected IFlyBehaviour flyBehaviour;

    protected IQuackBehaviour quackBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly(){
    }

    public void performQuack(){
    }
}
