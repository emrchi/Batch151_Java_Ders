package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    // scope ==> bir variable in

    public static void main(String[] args) {

        //1)Verilen iki sayiyi top[layan metodu olusturunuz.

        add(30,87);

        //2)Verilen iki sayiyi carpan metodu olusturunuz.

        multiply(46,12);

        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.

        System.out.println("firstTwoMultplyThirthadd(25,54,87) = " + firstTwoMultplyThirthadd(25, 54, 87));

        // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz
        double kup = getCube(2.3);
        System.out.println("Cubed number = " + kup);

        //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

        System.out.println("daireninCevresi(2) = " + daireninCevresi(2));

    }//main

    private static int daireninCevresi(int r) {
        return 2*314*r/100;
    }

    private static double getCube(double a) {
        return a*a*a;

    }

    public static int firstTwoMultplyThirthadd(int a, int b, int c) {
        return (a+b)*c;


    }

    private static void multiply(int a, int b) {
        System.out.println("Resultmultply" + (a*b));
    }

    static void add(int a, int b) { //Access modifier default oldugu icin bir sey yazilmadi
        System.out.println("Resultadd:" + (a+b));
    }


}//class
