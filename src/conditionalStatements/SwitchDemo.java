package conditionalStatements;

public class SwitchDemo {
    public static void main(String[] args) {

        String day = "harsha";

        switch (day){
            case "mon":
                System.out.println("ill go to office!!");
                System.out.println("ill attend meetings!!");
                System.out.println("ill do work");
                break;
            case "sun":
                System.out.println("ill play football!!");
                break;
            default:
                System.out.println("please enter a valid day!!");
                break;
            case "sat":
                System.out.println("ill go to pub!");

        }
    }
}
