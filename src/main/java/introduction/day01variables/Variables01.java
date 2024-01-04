package introduction.day01variables;

public class Variables01 {


    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskasina aciklamadir.
        /*
        java bu satirlari da okumaz
         */

        //*****************Variable olusturma***************
        //data type + variable name + atama operatoru(assigment opt.) + data + noktali virgul
             int          age                    =                        13        ;

        // java cumlesi ==> Statement
        // Data type + Variable Name ==> Variable Declaration
        // Assigment Operator(atama operatoru) + Variable degeri (Data) ==> Assignment
        // Eger variableDeclaration yapar, assignment yapmazsaniz Java kendi degerlerini (default==>varsayilan) koyar
        // Default degerler sayilar icin 0 dir.
        // Dilbilgisinde ki nokta ne ise java daki noktali virgul ayni seydir ve statementin bittigini gosterir
        // java da esittir demek "==". Yani Matamatik de "=", java da "==" dir.

        /*
             Java da temelde iki tip data vardir.
             1) primitive data type:
                  char, boolean, byte, short, int, long, float, double
             2) non-primitive data type:
                   String   baska ornek cok ve sayisiz hepsini yazamiyoruz.
         */
        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //stringlere verilen degerler daima cift tirnak icin de olmalidir.

        String studentName = "Ali Can";

        // string bir variable olusturup ona herhangi bir atama yapmaz isek java o variable a default olarak "null" koyar
        //null demek 0 demek degil cunku 0 da coding te bir degerdir
        //null demek ici bos obje demektir.
        //yani icinde variable veya method bulunmayan default obje denmektir

        // ****Data types:***

        //char data type:
        // tek karakterler icin kullanilir. ornegin ==> A, x, ?, 5

        //Ornek 2 : char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note: char data type da degerler tek tirnak icine konulmalidir.

        char isminIlkharfi = 'A' ;
        char firstLetterOfName = 'E';

        //boolean data type:
        //sadece true or false

        //Ornek 3 : boolean data type'inda emeklimisin icin bir variable olusturun ve false degerini atayin
        boolean emeklimisin = false;

        //byte data type:
        //tam sayilar icindir hafiza da 1 byte yer kaplar.
        //byte: -128 den +127 ye kadar tamsayi degerleri kullanilir.
        //Ornek 4 : byte data type'inda ogrenci yasi icin bir variable olusturunuz ve bir deger atayiniz
        byte studentAge = 23;

        //short data type:
        //tam sayilar icindir. hafiza da 2 byte yer kaplar.
        //short: -32768 ile +32767 arasinda ki tam sayilar icin kullanilir.
        //Ornek 5 : Site nufusu icin bir variable olusturun ve bir deger atayiniz
        short siteNufusu = 1200;

        //int data type:
        //tam sayilar icindir. hafiza da 4 byte yer kaplar.
        //int: -2.147,483.648 ile 2.147.483.647 arasinda ki tam sayilar icin kullanilir.
        //Ornek 6 : Ulke nufusu icin bir variable olusturun ve bir deger atayiniz
        int countryPopulatian = 18621452;

        //long data type:
        //tam sayilar icindir. hafiza da 8 byte yer kaplar.
        //long: -9.223.372.036.854.775.808 ile +9.223.372.036.854.775.807 arasinda ki tam sayilar icin kullanilir.
        //Ornek 7 : insan vucudun daki hucre sayisi icin bir variable olusturun ve bir deger atayiniz.
        //Note: Bir deger long ise degerin sonuna "L" konulur.
        //Note: Eger Long'a atadiginiz deger int deger araliginda ise long dememize ragmen degerin sonuna L koymasak
        // java onu int kabul eder.
        long cellNumberInHumanBody = 91112232584121L;


        //float data type:
        //virgullu sayilar icin kullanilir. (ondalikli sayilar ==> decimal Numbers) hafiza da 4 byte yer kaplar.
        //Ornek 8 : Gomlek ve ayakkabi fiyatari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //Note: java ondalikli sayilari yani "Decimal Numbers" otomatik olarak double kabul eder
        // eger float data type'i olmasin da israr ederseniz sonuna F or f koymalisiniz.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;

        System.out.println(shirtPrice+shoesPrice);
        // kisa yol==> sout

        int a = 12;
        int b = 13;
        System.out.print(a);
        System.out.println(b);

        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar

        //double data type:
        //virgullu sayilar icin kullanilir. (ondalikli sayilar ==> decimal Numbers) hafiza da fazla yer kaplar 8 byte.
        //virgulden sonraki rakam daha fazla alir.
        //Ornek 8 : Hucre agirligi ve Amipin agirligi icin iki tane variable olusturup agirliklari farkini console a yazdiriniz.
        double weightCell = 0.00000000000112;
        double weightAmip = 0.00000000000023;

        System.out.println(weightCell-weightAmip);




    }
}

