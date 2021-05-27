import addons.Milk;
import addons.Sugar;
import addons.WhippedCream;
import coffee.Coffee;
import coffee.Espresso;
import coffee.Latte;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 02:25 AM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Coffee Shop\n");

        Coffee espresso = new Espresso();

        espresso = new Milk(espresso);
        espresso = new WhippedCream(espresso);
        espresso = new Sugar(espresso);
        printBill(espresso);

        System.out.println();

        Coffee latte = new Latte();
        latte = new WhippedCream(latte);
        latte = new Sugar(latte);
        latte = new Sugar(latte);
        latte = new Sugar(latte);
        printBill(latte);
    }

    private static void printBill(Coffee coffee){
        System.out.println(coffee.getDescription());
        System.out.println("Total Bill : Rs "+coffee.cost());
    }
}
