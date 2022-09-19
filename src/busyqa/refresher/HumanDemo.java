package busyqa.refresher;

public class HumanDemo {


    public static void random() {
        System.out.println("random!");
    }

    public static void main(String[] args) {

        Human human1 = new Human("zain", 20); //creating an obj and assigning it to a Human variable
        human1.talk(); //zain is talking

        Human human2 = new Human("cheryl", 25); //creating an obj and assigning it to a Human variable
        human2.talk(); //cheryl is talking

        System.out.println(human1.NoOfHands);//0
        System.out.println(human2.NoOfHands);//0

        human1.name = "harakshjot";
        System.out.println(human2.name); //cheryl
        System.out.println(human1.name); //harakshjot
        Human.NoOfHands = 3;
        human2.setName("harsha");
        human1.talk(); //harakshjot is talking
        human2.talk(); //harsha is talking
        Human.setNoOfHands(5);
        System.out.println(human2.NoOfHands);//5
        System.out.println(human1.NoOfHands);//5
    }
}
