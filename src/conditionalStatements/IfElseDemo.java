package conditionalStatements;

public class IfElseDemo {
    public static void main(String[] args) {
        int marks  = -34;

        if(marks >= 80 && marks <= 100){
            System.out.println("good!!");
        }else if(marks >= 50 && marks <80){
            System.out.println("average!");
        }else if(marks < 50 && marks >=0){
            System.out.println("fail!");
        }else{
            System.out.println("invalid marks!!");
        }
    }
}
