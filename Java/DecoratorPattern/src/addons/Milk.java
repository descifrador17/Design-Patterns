package addons;

import coffee.Coffee;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 04:26 AM
 */
public class Milk extends Addons{

    Coffee coffee;

    double milkCost = 5.0;

    public Milk(Coffee coffee){
        this.coffee = coffee;
        getDescription();
    }

    @Override
    public double cost() {
        return this.coffee.cost()+milkCost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" + Milk : Rs "+milkCost;
    }
}
