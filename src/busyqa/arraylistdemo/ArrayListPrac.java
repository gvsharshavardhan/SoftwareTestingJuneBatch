package busyqa.arraylistdemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPrac {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Aksh");
        list.add("zain");
        list.add("cheryl");



        for(String fruit : list){
            System.out.print(fruit+" ");
        }

        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");//0
        animals.add("rat");//1
        animals.add("bat");//2
        animals.add("dog");//3

        System.out.println(animals);

        for(int i=animals.size()-1;i>=0;i--){
            System.out.println( animals.get(i));
        }



    }
}
