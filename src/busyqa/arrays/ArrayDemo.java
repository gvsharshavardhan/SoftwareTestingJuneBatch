package busyqa.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] i = {1,5,7,8,9};
        System.out.println(i[4]);

        String[] names = new String[4];
        names[0] = "cheryl";
        names[1] = "zain";
        names[2] = "harakshjot";

        System.out.println(names[2]);
        System.out.println(names);

        for(int j =0;j<names.length;j++){ // 0 1 2 3
            System.out.println(names[j]);
        }
    }
}
