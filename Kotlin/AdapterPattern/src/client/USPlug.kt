package client

import adaptee.UKSocket
import adapter.UStoUKAdapter

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 07:56 AM
 *
 */
class USPlug {
    fun insertUSPlug(){
        println("Damn..I'll need an Adapter")
        val adapter = UStoUKAdapter(UKSocket())
        adapter.insert()
    }
}