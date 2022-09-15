package classAndObjects;

public class Human {

    //attr//instance variables
    String name = "abc" ; //null
    int age = 78; //0
    public double weight = 90; //0.0
    static int noofhands ;

   public Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(){

    }

    void assignValues(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    //behaviours
    //instance methods
    void talk() {
        System.out.println(name + " talking " + age);
    }

    void talk(int minutes){
        System.out.println( name + " talking  for " + minutes + " minutes!" );
    }

    void talk(String friend){
        System.out.println(name + " talking to " + friend);
    }

    void talk(int minutes, String friend){
        System.out.println(name + " is taking to " + friend + " from  " + minutes + " minutes!");
    }

    void walk() {
        System.out.println(name + " walking");
    }
}
