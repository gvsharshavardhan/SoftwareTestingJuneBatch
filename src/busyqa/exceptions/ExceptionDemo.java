package busyqa.exceptions;

import busyqa.Car;

public class ExceptionDemo {
    static Car c;

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] nums = {34, 56, 89};

        try {
            System.out.println(a / b);
        } catch (ArithmeticException aiofbe) {
            System.out.println(aiofbe);
        }
        try {
            System.out.println(nums[100]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }
        c.dummy();

        System.out.println("bye!");

    }
}
