package cluster_of_classes

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 04-06-2021
 *   Time: 03:23 AM
 *
 */
class Audi : Car {
    override fun model() {
        println("A5")
    }

    override fun price() {
        println("$20000")
    }
}