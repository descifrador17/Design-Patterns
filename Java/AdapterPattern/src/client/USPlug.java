package client;

import adaptee.UKSocket;
import adapter.IAdapter;
import adapter.UStoUKAdapter;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 07:34 AM
 */
public class USPlug {

    public void insertInSocket(){
        System.out.println("I'll need an Adapter");
        IAdapter adapter = new UStoUKAdapter(new UKSocket());
        adapter.insert();
    }
}
