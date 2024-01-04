package javaders.day18constructorsstatickeyword;

    /*
    We need "constructor" to create an object from a class.
    When we create a class Java puts a constructor in it, because Java knows classes are for creating objects.
    When we create a class you will not see any constructor in it, but the class has constructor,
    it is invisible constructors "Default Constructor"
    We can create many constructors in a class:
        i.. constructors names will be same because every costructor uses class name as name
        ii.. Every costructor must have different parameters.


    1. Constructor nasil olusturulur:
        Access modifier + Class name + () = {}


        Method nasil olusturulur:
        Access modifier + Return type + method name + () = {}

    2. Method ile Constructor arasindaki farklar nelerdir?
        i)"Method"larda "return type" olur, "Constructor" larda olmaz.
        ii)"Method"lar yaptiklari ise gore isimlendirilirler,
            "Constructor" lar ise "Class ismi" ile isimlendirilirler
        iii)"Method"lar bir aksiyon yapmak icin olusturulur,
            "Constructor" lar ise object olusturmak icindir.
        iv)"Method" isimleri kucuk harfle baslar, "Constructor" isimleri Class ismi oldugu icin buyuk harfle baslar.
    3.Parametreli Constructor'lar olusturarak ayni Class'dan farkli ozelliklere sahip object'ler olusturabiliriz.
     */

public class Car {

    String make = "Honda";
    String model;
    int year ;
    int price = 18000;


    //Default Constructor
    //access modifier + Class name + () = {}
    //Default Constructor'lar "parametre" kullanmaz.
    //Default Constructor"larin body'si bostur.
    //Java kiskanctir. Siz "Default Constructor" i elle yazdiginizda
    //Java Object class icindeki default constructor'u  siler kullandirmaz.
    public Car(){

    }


    //Costum Constructor (uses all variables)
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Costum Constructor (uses some variables)
    public Car(String make) {
        this.make = make;
    }

    //Costum Constructor Create Construct by using Intellij  (right button on the mouse genarete+constructor)
    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

}
