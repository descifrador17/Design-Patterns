package coffee;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 04:25 AM
 */
public class Latte extends Coffee{

    public Latte(){
        description = "Latte : Rs "+cost();
    }

    @Override
    public double cost() {
        return 21.5;
    }
}
