import addons.Milk
import addons.Sugar
import addons.WhippedCream
import coffee.Coffee
import coffee.Espresso
import coffee.Latte

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 27-05-2021
 *   Time: 04:54 AM
 *
 */
fun main() {
    println("Welcome to the Coffee Shop\n")

    var espresso: Coffee = Espresso()

    espresso = Milk(espresso)
    espresso = WhippedCream(espresso)
    espresso = Sugar(espresso)
    printBill(espresso)

    println()

    var latte: Coffee = Latte()
    latte = WhippedCream(latte)
    latte = Sugar(latte)
    latte = Sugar(latte)
    latte = Sugar(latte)
    printBill(latte)
}

private fun printBill(coffee: Coffee) {
    println(coffee.getCoffeeDescription())
    println("Total Bill : Rs " + coffee.cost())
}