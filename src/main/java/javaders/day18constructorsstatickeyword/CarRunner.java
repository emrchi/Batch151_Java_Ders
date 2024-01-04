package javaders.day18constructorsstatickeyword;

public class CarRunner {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("Mercedes","C300",2023,30000);
        Car c3 = new Car("Audi","R8",2023,50000);
        Car c4 = new Car("BMW");

        System.out.println(c1.make); //Honda
        System.out.println(c2.model); //C300
        System.out.println(c3.model); //R8
        System.out.println(c4.year); //0
        System.out.println(c4.price);//18000
        System.out.println(c4.model); //null

    }
}
