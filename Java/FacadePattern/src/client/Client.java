package client;

import facade.Facade;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 04-06-2021
 * Time: 03:06 AM
 */
public class Client {
    public void getAllCars(){

        Facade facade = new Facade();

        System.out.println("---Buying Toyota---");
        facade.getToyota();
        System.out.println("---Buying Audi---");
        facade.getAudi();
        System.out.println("---Buying Honda---");
        facade.getHonda();

    }
}
