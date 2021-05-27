package addons

import coffee.Coffee

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 27-05-2021
 *   Time: 04:57 AM
 *
 */
class Sugar(c : Coffee) : Addons() {

    val coffee = c

    var sugarCost = 5.0

    override fun getCoffeeDescription(): String {
        return "${coffee.getCoffeeDescription()} + Sugar : Rs $sugarCost"
    }

    override fun cost(): Double {
        return coffee.cost()+sugarCost
    }
}