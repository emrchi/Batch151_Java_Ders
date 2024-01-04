package javaders.day24inheritancepolymorphism;

public class CarRunner {

    public static void main(String[] args) {

        Toyota t1 = new Toyota(); //object

        t1.model = "Prius";
        System.out.println(t1.model);

        Honda h1 = new Honda();
        Volvo v1 = new Volvo();
        v1.move();
    }
}
