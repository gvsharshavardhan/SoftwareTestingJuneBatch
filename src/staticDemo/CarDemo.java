package staticDemo;

public class CarDemo {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.noOfWheels = 4;
        c1.noOfSeats = 5;

        Car c2 = new Car();
        c2.noOfWheels = 10;
        c2.noOfSeats = 7;

        System.out.println(c1.noOfSeats); //5
        System.out.println(c1.noOfWheels); //10
        System.out.println(c2.noOfWheels); //10
        System.out.println(c2.noOfSeats); //7

        System.out.println(c1.num);// 12
        System.out.println(c2.num);// 12

    }
}
