package coffee

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 27-05-2021
 *   Time: 04:55 AM
 *
 */
class Latte : Coffee() {

    init {
        description = "Latte : Rs ${cost()}"
    }

    override fun cost(): Double {
        return 20.0
    }

}