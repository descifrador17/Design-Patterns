package addons

import coffee.Coffee

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 27-05-2021
 *   Time: 04:57 AM
 *
 */
class WhippedCream(c: Coffee): Addons() {
    val coffee = c

    var whippedCreamCost = 3.0

    override fun getCoffeeDescription(): String {
        return "${coffee.getCoffeeDescription()} + Whipped Cream : Rs $whippedCreamCost"
    }

    override fun cost(): Double {
        return coffee.cost()+whippedCreamCost
    }
}