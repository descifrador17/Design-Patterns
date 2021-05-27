package addons;

import coffee.Coffee;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 04:34 AM
 */
public class Sugar extends Addons{

    Coffee coffee;

    double sugarCost = 2.5;

    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" + Sugar : Rs "+sugarCost;
    }

    @Override
    public double cost() {
        return coffee.cost()+sugarCost;
    }
}
