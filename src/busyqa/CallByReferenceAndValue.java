package busyqa;

import busyqa.classAndObjects.Human;

public class CallByReferenceAndValue {

    static int a = 10;
    static int b = 100;

    public static void main(String[] args) {
        System.out.println(a); //10
        callByValue(a);
        System.out.println(a); //10


        Human h = new Human("harsha", 10,20);
        System.out.println(h.weight); //20
        callByReference(h);
        System.out.println(h.weight); //21
    }

    static void callByValue(int a) {
        a++;
        System.out.println("local : " + a);//11
        System.out.println(b);//100
    }

    static void callByReference(Human h){
        h.weight ++;
    }
}