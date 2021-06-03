package facade;

import cluster_of_classes.Audi;
import cluster_of_classes.Car;
import cluster_of_classes.Honda;
import cluster_of_classes.Toyota;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 04-06-2021
 * Time: 03:06 AM
 */
public class Facade {

    private final Car audi;
    private final Car honda;
    private final Car toyota;

    public Facade() {
        this.audi = new Audi();
        this.honda = new Honda();
        this.toyota = new Toyota();
    }

    public void getAudi() {
        audi.model();
        audi.price();
    }

    public void getHonda() {
        honda.model();
        honda.price();

    }

    public void getToyota() {
        toyota.model();
        toyota.price();
    }
}
