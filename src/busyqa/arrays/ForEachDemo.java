package busyqa.arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] i = {12, 23, 34, 45};

//        for(int a=0;a<i.length;a++){
//            System.out.println(i[a]);
//        }

//        for(int x : i){
//            System.out.println(x);
//        }

        Object[][] obj = new Object[3][3];
        obj[0][0] = "busyqa";
        obj[0][1] = 234;
        obj[0][2] = 234.5666;
        obj[1][0] = false;
        obj[1][1] = true;
        obj[1][2] = '@';
        obj[2][0] = "harsha vardhan";
        obj[2][1] = 87878;
        obj[2][2] = 76.4536;

        for ( Object[] x: obj){
            for(Object y :x){
                System.out.print(y + "             ");
            }
            System.out.println();
        }
    }
}
