package cluster_of_classes;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 04-06-2021
 * Time: 03:07 AM
 */
public class Toyota implements Car{
    @Override
    public void model() {
        System.out.println("Toyota Supra");
    }

    @Override
    public void price() {
        System.out.println("$40000");
    }
}
