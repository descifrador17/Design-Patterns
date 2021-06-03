package facade

import cluster_of_classes.Audi
import cluster_of_classes.Honda
import cluster_of_classes.Toyota

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 04-06-2021
 *   Time: 03:29 AM
 *
 */
class Facade {
    private var audi = Audi()
    private var honda = Honda()
    private var toyota = Toyota()

    fun buyAudi(){
        audi.model()
        audi.price()
    }

    fun buyHonda(){
        honda.model()
        honda.price()
    }

    fun buyToyota(){
        toyota.model()
        toyota.price()
    }

}