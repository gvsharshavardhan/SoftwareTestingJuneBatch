package busyqa;

public  class Car {

    private String name;

    private void drive() {
        System.out.println(name + " is Driving!");
    }

    protected Car(){

    }

    public static Car createCar(){
        return new Car();
    }

    //within the pkg (or) within inheritance hierarchy
    protected void test(){
        drive();
    }


    public void dummy(){
        System.out.println("dummy car method!");
    }
}