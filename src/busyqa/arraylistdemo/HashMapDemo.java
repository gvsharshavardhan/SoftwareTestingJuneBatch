package busyqa.arraylistdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    //key:value pair is called as an entry
    public static void main(String[] args) {
        HashMap<String, Integer> dict = new HashMap();
        dict.put("math", 100);
        dict.put("che", 89);
        dict.put("phy", 90);
        dict.put("eng", 46);


//        System.out.println(dict);
//        System.out.println(dict.get(100));//null
//        System.out.println(dict.remove("phy",90));
//        System.out.println(dict);

        //set of entries[entry,entry,entry]
        for (Map.Entry entry : dict.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
