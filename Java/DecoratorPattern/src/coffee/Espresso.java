package coffee;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 04:23 AM
 */
public class Espresso extends Coffee{

    public Espresso(){
        description = "Espresso : Rs "+cost();
    }

    @Override
    public double cost() {
        return 20;
    }
}
