package javaders.day24inheritancepolymorphism;

public class Car {

    public void move(){
        System.out.println("Cars move..."); //metod
    }

    public void getBreak() {
        System.out.println("Cars getBreak..."); //metod
    }

    public void engine() {
        System.out.println("Cars have engine..."); //metod
    }

    public String model = "Car"; //Variable
    public int prize = 0; //Variable

    public Car(){                                  //Constructor

        System.out.println("Car constructor 1");
    }

    public Car(int i){                                  //Constructor with parameter
        System.out.println("Car constructor 2");

        //Butun Constructor'larin ilk satirinda gorunmez bir kod vardir ==> super();
        //isterseniz gorunur sekildede yazabilirsiniz.
        //Bu kod Parent'i temsil eder ve parent'e yonlendirir
        //Inheritance'da object olustururken constructor'lar yukaridan(Parent) asagi(Child) dogru calistirilir.
        //Bizi Parent'taki Constructor'a tasiyan kod super() costructor'dur.;
        //Constructor object olusturmak icin kullanilir.
        //Parent Class ve Super Class es anlamlidir
        //Sub Class ve Child Class es anlamlidir
        //this() constructor'u sizi ayni class icindeki costructorlar arasinda gezdirir.
        //"this" key word'u icinde bulundugunuz class'daki  Variable'lari cagirmaya yarar
        //"super" key word'u parent class'daki Variable'lari cagirmaya yarar.
        //Inheritance'da Variable ve Method'lari cagirmak icin this veya super kullanilir.
        //Parent'dan child'a "HAS-A" iliskisi vardir.
        //Child'dan Parent'a "IS-A" iliskisi vardir.
        //Eger data type'lari arasinda "IS_A" ve "HAS-A" iliskisi varsa bu data type'larina "COVARIANT" denir.
        /*
        Parent-child classlar arasındaki fark, object üzerinden method ve variable çağırma şekillerinde ortaya çıkar.
        Bir parent class'taki bir method ya da variable'ı çağırmak için, o class'tan bir object oluşturduktan sonra
        o object üzerinden çağırılması gerekir. Ancak bir child class'taki method veya variable,
        parent class'taki bir method veya variable'ı override ettiği takdirde, o child class'tan oluşturulan bir object
        üzerinden çağrılması gerekmektedir. Böylece, parent ve child classlar arasındaki ilişki,
        inheritance (miras alma) prensiplerine uygun bir şekilde gerçekleştirilmiş olur.
         */

        /*
        1)Polymorphism ==> coklu sekil demektir
          Yani bir method'un farkli sekillerde karsimiza cikmasi demektir.
          Polymorphism = Overloading + Overriding
        2)Overriding parent'daki methodu child'larin ihtiyaclarina gore ozellestirme islemi demektir.
        3)overriding yapmak icin mouse'un sag tusu ile generate yapariz.
        4)Overriding de method'un body'si degidtirilir. Overloading de ise parametreler degistiriliyordu.
        5)Overriding de method signature'a dokunulmaz, dokunursaniz Java kizar.
        6)Static method'lar override edilemezler. Cunku static method'lar tum child'lar icin ortak method'lardir.
          Bir child bir ortak method'u degistirdiginde diger child'lar bundan olumsuz etkilenebilir.
          Bu yuzden Java static method'larin override edilmesine izin vermez.
        7)Final method'lar override edilemez.Cunku Final method'larin body'si degistirilemez.
            a)Final keyword'unu Variable'lar ile kullanabiliriz.
                i)Variable'i final yapacak ise mutlaka deger atamaliyiz.
                ii)ilk atanan deger degistirilemez.
            b)Final keyword'unu methodlar ile kullanabiliriz.
                i)final method'un body'si degistirilemez.
                ii) methodun body si degistiriemeyince override yapmak mumkun olmaz

           c) Final keyword unu Class lar ile kullanabiliriz
                    => class final ise O classin child i olamaz


         */

    }
}
