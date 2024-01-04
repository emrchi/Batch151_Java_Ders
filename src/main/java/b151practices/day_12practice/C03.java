package b151practices.day_12practice;

public class C03 {

    int fiyat = 300000;
    int yil = 2023;
    String marka = "opel";

    public C03(int fiyat, int yil, String marka) {
        this.fiyat = fiyat;
        this.yil = yil;
        this.marka = marka;

    }

    public C03() {

    }


    public static void main(String[] args) {

        C03 obj1 = new C03();

        System.out.println(obj1.fiyat); //30000
        System.out.println(obj1.yil-3); //2020
        System.out.println(obj1.marka.replace("opel", "Mercedes")); //Mercedes
        System.out.println(obj1.yil); //2023
        System.out.println(obj1.marka); //opel

        C03 obj2 = new C03(500000, 2021, "Citroen");

        System.out.println(obj2.fiyat + " " + obj2.yil + " " + obj2.marka);
    }


}
