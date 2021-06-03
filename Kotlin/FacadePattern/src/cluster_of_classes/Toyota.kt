package cluster_of_classes

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 04-06-2021
 *   Time: 03:23 AM
 *
 */
class Toyota: Car {
    override fun model() {
        println("Toyota Supra")
    }

    override fun price() {
        println("$40000")
    }
}