package arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {

        int[][] i = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(i[0][0]);

        int[][] j = new int[2][2];

        j[0][0] = 100;
        j[0][1] = 345;
        j[1][0] = 78;
        j[1][1] = 88;

        System.out.println(j);

        for(int a = 0; a<j.length; a++){//outer array
            for(int b =0; b<j[a].length;b++){//inner array
                System.out.print(j[a][b] + "        ");
            }
            System.out.println();
        }


    }
}
