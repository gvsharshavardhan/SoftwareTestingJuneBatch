package basics;

public class IncrementDecrementOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = --b;
        int d = ++a;
        int e = c--;
        int f = d +e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}