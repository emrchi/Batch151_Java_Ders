package b151practices.day_10practice;

public class C03_Instance {

    int sayi;
    String bransIsmi = "Java";
    boolean okuldaMi;


    public static void main(String[] args) {

         /*

        sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
        Bu instance variable'leri main icerisinde yazdıralım

        Note: Instance variable'lar main method'un disinda yani class seviyesinde olusturulur.
        Static degildirler. static bir method uzerinden ulasabilmek icin object olusturup object uzerinden cagirmaliyiz.



        */

        C03_Instance obj1 = new C03_Instance();
        System.out.println(obj1.sayi); //0
        System.out.println(obj1.bransIsmi); //Java
        System.out.println(obj1.okuldaMi); //false



        //instance variable'lar object'e baglidir. Hangi object uzerinden variable'da degisiklik yapildiysa
        //yapilan bu degisiklik sadece o object'i baglar.

        obj1.sayi = 10;
        System.out.println(obj1.sayi); //10

        C03_Instance obj2 = new C03_Instance();
        System.out.println(obj2.sayi); //0

        obj1.bransIsmi = "SQL";
        System.out.println(obj1.bransIsmi); //SQL
        System.out.println(obj2.bransIsmi); //Java
        System.out.println(obj1.okuldaMi); //false

        obj1.okuldaMi = true;
        System.out.println(obj1.okuldaMi); //true
        System.out.println(obj2.okuldaMi); //false

        obj2.sayi = 100;
        System.out.println(obj2.sayi); //100

        obj2.bransIsmi = "API";
        System.out.println(obj2.bransIsmi); //API
        System.out.println(obj1.bransIsmi); //SQL





    }
}
