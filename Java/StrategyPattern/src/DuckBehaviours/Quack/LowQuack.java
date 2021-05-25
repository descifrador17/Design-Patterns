package DuckBehaviours.Quack;

public class LowQuack implements IQuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Low Quack");
    }
}
