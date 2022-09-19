package busyqa.interfaceDemo;

public abstract class Father implements GrandFather {

    public void garage() {
        System.out.println("2 car garage");
    }

    public void bedrooms() {
        System.out.println("3 bed rooms");
    }

    public void homeTheater() {
        System.out.println("dolby home theater");
    }

    abstract public void backyard();

}
