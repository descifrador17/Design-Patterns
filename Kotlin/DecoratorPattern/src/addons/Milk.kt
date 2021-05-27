package addons

import coffee.Coffee

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 27-05-2021
 *   Time: 04:57 AM
 *
 */
class Milk(coffee: Coffee) : Addons(){

    private val c = coffee

    var milkCost = 5.0

    override fun getCoffeeDescription(): String {
        return "${c.getCoffeeDescription()} + Milk : Rs $milkCost"
    }

    override fun cost(): Double {
        return c.cost()+milkCost
    }


}