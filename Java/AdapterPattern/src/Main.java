import client.USPlug;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 07:27 AM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---Adapter Pattern---");
        System.out.println();

        USPlug plug = new USPlug();
        plug.insertInSocket();
    }
}
