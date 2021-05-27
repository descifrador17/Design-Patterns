package addons;

import coffee.Coffee;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 04:33 AM
 */
public class WhippedCream extends Addons{

    Coffee coffee;

    double whippedCreamCost = 10.0;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" + Whipped Cream : Rs "+whippedCreamCost;
    }

    @Override
    public double cost() {
        return coffee.cost()+whippedCreamCost;
    }
}
