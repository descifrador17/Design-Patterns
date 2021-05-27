package coffee;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 27-05-2021
 * Time: 04:20 AM
 */
public abstract class Coffee {
    String description = "Coffee";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
