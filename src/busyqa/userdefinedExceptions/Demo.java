package busyqa.userdefinedExceptions;

public class Demo {
    public static void main(String[] args) {

        int age = 15;

        if (age > 18) {
            System.out.println("eligible to vote");
        } else {
            throw new ArithmeticException();
        }

        System.out.println("he can enter into polling booth to vote");
        System.out.println("he can have privilage1");
        System.out.println("he can have privilage1");
        System.out.println("he can have privilage1");

    }
}
