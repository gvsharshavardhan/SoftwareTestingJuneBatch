package busyqa;

import busyqa.classAndObjects.Human;
import busyqa.classAndObjects.fruitsPkg.*;


public class PackageDemo {

    public static void main(String[] args) {
        Car tesla = Car.createCar();
        Human h = new Human();
        Fruit apple = new Fruit();
        Vegetable eggplant = new Vegetable();

        tesla.test();
    }
}
//100 3
