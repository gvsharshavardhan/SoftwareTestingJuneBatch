package busyqa.strings;

public class StringDemo {
    public static void main(String[] args) {
        String str = "busyqa"; //string literal
        String str2 = new String("java"); //string object

        String str3 = "busyqa123";

        System.out.println(str.equals(str3));

        String str4 = str + str2;
        System.out.println(str4);

        String fname = "harsha";
        String lname = "vardhan";
        String fullName = fname.concat(lname);
        System.out.println(fullName);

        //character array to string
        char[] ch = {'t','e','s','t','i','n','g'};
        String chToStr = new String(ch);
        System.out.println(chToStr);

        //string to string array
        String lang = "python,java,dart,kotlin";
        String[] languages = lang.split(",");
        for(String x:languages){
            System.out.println(x);
        }
        System.out.println(languages[1]);

        System.out.println("**********************************************************");
        //access a specific character from a string
        String fruit = "apple";
        char c = fruit.charAt(3);
        System.out.println(c);

        //length of a string
        System.out.println(fruit.length());

        //contains
        System.out.println(fruit.contains("lpp"));

        //
        String animal1 = "tiger";
        String animal2 = "Tiger";
        System.out.println(animal1.equals(animal2)); //false
        System.out.println(animal1.equalsIgnoreCase(animal2)); //true

        System.out.println("######################### is empty ###############################");
        //empty or not
        String flower1 = "";
        String flower2 = "rose";
        System.out.println(flower1.isEmpty()); // true
        System.out.println(flower2.isEmpty()); // false


        //String is immutable
        System.out.println("######################### replace ###############################");
        String car = "teslal";
        System.out.println(car); //tesla
        car = car.replace("l","z");
        System.out.println(car); //tesza

        System.out.println("######################### upper and lower case ###############################");

        String media = "faceBook";
        System.out.println(media);
        media = media.toLowerCase();
        System.out.println(media);
        media = media.toUpperCase();
        System.out.println(media);

        System.out.println("######################### substring ###############################");

        //start index , end index + 1
        String color = "greenblueorange";
        String sub = color.substring(5,9);
        System.out.println(sub);

        String color2 = "greenYellowRed";
        System.out.println(color2.substring(5));

        String str10 = "adc";
        String str11 = "aac";
        System.out.println( str10.compareTo(str11));

    }
}
