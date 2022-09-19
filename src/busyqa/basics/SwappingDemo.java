package busyqa.basics;

public class SwappingDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("before swapping:");
        System.out.println(a);
        System.out.println(b);

        int c;

        c = b;
        b = a;
        a = c;

        System.out.println("After swapping");
        System.out.println(a);//10
        System.out.println(b);//10
    }
}
