package busyqa.inheritance;

public class Son extends Father {

    String silver = "20lbs silver";
//    String gold = "100lbs gold";

    Son(String gold){ //75lbs
        super(gold); //75lbs
    }

     void goldBusiness() {

        super.goldBusiness();//father's gold business
        System.out.println("son's gold business ");
        System.out.println("father gold: " + super.gold);//75lbs
        System.out.println("son's gold: " + gold);//75lbs
    }
}
