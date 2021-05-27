package coffee

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 27-05-2021
 *   Time: 04:55 AM
 *
 */
abstract class Coffee {
    var description: String = "Coffee"

    abstract fun cost(): Double

    open fun getCoffeeDescription(): String{
        return description
    }
}