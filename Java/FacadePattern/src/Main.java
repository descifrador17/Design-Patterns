import client.Client;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 04-06-2021
 * Time: 12:21 AM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("FACADE EXAMPLE");

        Client client = new Client();

        client.getAllCars();
    }
}
