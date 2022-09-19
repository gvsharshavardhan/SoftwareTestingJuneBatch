package busyqa.methods;

import java.util.Scanner;

public class MethodDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String username = takeUsernameFromTheUser();
        String password = takePasswordFromUser();
        printLoginStatus(validateCredentials(username, password));

    }

    static boolean validateCredentials(String username, String password) {
        return username.equals("busyqa") && password.equals("pass");
    }

    static void printLoginStatus(boolean status) {
        if (status) {
            System.out.println("Logged in!");
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    //no ip, op
    static String takeUsernameFromTheUser() {
        System.out.println("please enter username: ");
        String username = sc.nextLine();
        return username;

    }

    static String takePasswordFromUser() {
        System.out.println("please enter password: ");
        String password = sc.nextLine();
        return password;
    }


    static void talk() {
        System.out.println("Walking!!");
    }

}