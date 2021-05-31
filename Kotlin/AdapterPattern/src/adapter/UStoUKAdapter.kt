package adapter

import adaptee.UKSocket

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 07:58 AM
 *
 */
class UStoUKAdapter(val ukSocket: UKSocket): IAdapter {
    override fun insert() {
        println("US to UK Adapter is used")
        ukSocket.insertInUSSocket()
    }
}