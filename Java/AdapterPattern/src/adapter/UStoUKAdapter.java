package adapter;

import adaptee.UKSocket;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 31-05-2021
 * Time: 07:35 AM
 */
public class UStoUKAdapter implements IAdapter{

    UKSocket ukSocket;

    public UStoUKAdapter(UKSocket ukSocket) {
        this.ukSocket = ukSocket;
    }

    @Override
    public void insert() {
        System.out.println("US to UK Adapter is used");
        this.ukSocket.specificInsert();
    }
}
