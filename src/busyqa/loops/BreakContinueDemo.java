package busyqa.loops;

public class BreakContinueDemo {
    public static void main(String[] args) {
        //print numbers from 1 to 50 and stop the loop once it sees number 40
        //print number from 1 to 50 and continue if the number is 40
        for(int i=1;i<=50;i++ ){

            if(i==40){
                continue;
            }
            System.out.println(i);
        }

        //2 * 1 = 2
        //2 * 2 = 4
        //8789892233
        //3322989878

    }
}
