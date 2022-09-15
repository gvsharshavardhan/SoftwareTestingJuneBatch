package refresher;

public class Human {

    //instance fields // instance attr
    String name;//null
    Integer age;//0

    //static fields
    static int NoOfHands;

    //initializing the varibles while create the obj itself
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //behaviours
    void talk() {
        System.out.println(name + " is talking");
    }

    void setName(String name){
        this.name = name;
    }

    static void setNoOfHands(int count){
        NoOfHands = count;
    }


}
