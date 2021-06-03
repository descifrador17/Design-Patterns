package cluster_of_classes;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 04-06-2021
 * Time: 03:11 AM
 */
public class Honda implements Car{
    @Override
    public void model() {
        System.out.println("Honda City");
    }

    @Override
    public void price() {
        System.out.println("$8000");
    }
}
