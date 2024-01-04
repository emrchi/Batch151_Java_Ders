package introduction.day03scanner;

public class Car {

    //Variables olusturalim
    public  String model = "Corolla";
    public int fiyat = 20000;

    //Main methodu her class a koymak zorunda degiliz.

    //Methos olusturalim
    //Note:"returne type" void oldugunda method icinde "return" keyword'u kullanilmaz
    //eger vbir method yeni bir data uretmiyorsa return type i void olur
    public void hareket(){
        System.out.println("Corolla hizli hareket eder...");


    }
    public void dur(){
        System.out.println("Corolla guvenli bir sekilde durur...");
    }
}
