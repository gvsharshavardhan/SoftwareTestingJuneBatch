package busyqa.inheritance;

public class Demo {

    public static void main(String[] args) {

//        Father f = new Father();
//        System.out.println(f.gold);
//        f.goldBusiness();

        Son s = new Son("75lbs");
        System.out.println(s.silver); //20lbs silver
        System.out.println(s.gold); //75lbs gold
        s.goldBusiness();


    }


}
