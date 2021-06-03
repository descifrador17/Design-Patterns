package cluster_of_classes;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 04-06-2021
 * Time: 03:07 AM
 */
public class Audi implements Car{
    @Override
    public void model() {
        System.out.println("A5");
    }

    @Override
    public void price() {
        System.out.println("$20000");
    }
}
