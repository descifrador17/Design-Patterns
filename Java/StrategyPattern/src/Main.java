import Duck.CityDuck;
import Duck.Duck;
import Duck.WildDuck;
import DuckBehaviours.Fly.FlyHopping;
import DuckBehaviours.Fly.FlyWithWings;
import DuckBehaviours.Fly.IFlyBehaviour;
import DuckBehaviours.Quack.HighQuack;
import DuckBehaviours.Quack.IQuackBehaviour;
import DuckBehaviours.Quack.LowQuack;

public class Main {
    public static void main(String[] args) {

        IFlyBehaviour flyWithWings = new FlyWithWings();
        IFlyBehaviour flyHopping = new FlyHopping();

        IQuackBehaviour lowQuack = new LowQuack();
        IQuackBehaviour highQuack = new HighQuack();

        Duck cityDuck = new CityDuck(flyHopping, lowQuack);
        Duck wildDuck = new WildDuck(flyWithWings, highQuack);

        System.out.println("City Duck");
        cityDuck.performFly();
        cityDuck.performQuack();

        System.out.println("Wild Duck");
        wildDuck.performFly();
        wildDuck.performQuack();

    }
}
