package client

import cluster_of_classes.Audi
import cluster_of_classes.Car
import cluster_of_classes.Honda
import cluster_of_classes.Toyota
import facade.Facade

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 04-06-2021
 *   Time: 03:23 AM
 *
 */
class Client {

    private val facade = Facade()

    fun buyCars(){
        println("---Buying Toyota")
        facade.buyToyota()
        println("---Buying Audi")
        facade.buyAudi()
        println("---Buying Honda")
        facade.buyHonda()
    }
}