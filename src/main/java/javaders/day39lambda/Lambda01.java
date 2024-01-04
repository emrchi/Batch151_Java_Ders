package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList); //Tom Jim Clara Tom Clara Angelina
        System.out.println();
        printEl(myList);       //Tom Jim Clara Tom Clara Angelina
        System.out.println();
        printElExeptStartsWithT(myList); //Jim Clara Clara Angelina
        System.out.println();
        printElLeghtLessThenFor(myList); //Tom Jim Tom
        System.out.println();
        printElLeghtMoreThenForWithUpper(myList); //CLARA CLARA ANGELINA
        System.out.println();
        printElLeghtMoreThanForUniqueLowerCase(myList); //clara angelina
        System.out.println();
        printElUniqueToUpperCaseSorted(myList); //ANGELINA CLARA JIM TOM
        System.out.println();
        printElUniqueToLowerCaseSortByLenght(myList); //tom jim clara angelina

    }


    //Ex 1: Bir List'deki elemanlari console'a yazdiran methodu olusturunuz.

    //1.Yol:
    public static void printElements(List<String> myList){

        for(String w : myList){
            System.out.print(w + " ");
        }


    }
    //2.Yol: LAMBDA EXPRESSION
    public static void printEl(List<String> myList) {

        myList.stream().//DATALARI AKISA SUNAR
                forEach(t-> System.out.print(t +" ")); //Functional Programming yani Lambda Function Programmingdir.
    }

    /*
    Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk. Listimize add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde yazdiriyor.
  Her yazdirmada bir bosluk birakiyor.
  Ilk yolumuzda uc katli bir yapi olusturuyoruz. Buna yapisal kod denir. Mimari bir yapi olusturduk.
Ikinci yolda ise sadece for each dedik. Burada bir yapi olusturmak yerine javaya direct methodun ismini veriyoruz. Bu proglama tarzina functional programming denir
     */

    //Ex 2: Bir List'deki T ile baslayanlar haric elemanlari console'a yazdiran methodu olusturunuz.

    public static void printElExeptStartsWithT(List<String> myList){

        myList.stream().filter(t -> !t.startsWith("T")).forEach(t -> System.out.print(t + " "));

        /*
        Example 2: Bir Listteki t ile baslayanlar haric tum elemanlari console'a yazdiran methodu olusturunuz. Yazdiran
dedigi icin return type'i void yapacagiz.
Methodumuz: public static void printElExceptStartsWithT()
Bu method yine bir list kullanacak. Javaya bu listi stream'e cevir, t ile baslayanlari filter et diyecegiz.
myList.stream().filter(t->!t.startsWith("T").forEach(t-> System.out.print(t + " ")
filter methodunu eleme yapmakta kullandik. t ile baslayanlari eledik.
yazdirinca t ile baslayan Tom'u goremedik. Jim ve Clara'yi gorduk.
         */


    }
    //Ex 3: Bir List'de character sayisi 4'den az olan tum elemanlari console'a yazdiran methodu olusturunuz.

    public static void printElLeghtLessThenFor(List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));

    }
    //Ex 4: Bir List'de character sayisi 4'den cok olan tum elemanlari Buyuk harflerle console'a yazdiran methodu olusturunuz.

    public static void printElLeghtMoreThenForWithUpper(List<String> myList) {
        myList.stream().
                filter(t -> t.length() > 4). //eleme yapar filtreler
                map(t -> t.toUpperCase()).               //map() var olan elemanlarin yapisini degistirir.
                forEach(t -> System.out.print(t + " "));

    }

    //Ex 5: Bir List'de character sayisi 4'den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran methodu olusturunuz.

    public static void printElLeghtMoreThanForUniqueLowerCase(List<String> myList) {
        myList.
                stream().
                distinct().                //distinct()methodu tekrarli elemanleri bir kere gosterir. tekrarsiz.
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void printElUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().                //Natural ordering olarak siralar.
                forEach(t -> System.out.print(t + " "));

    }
//Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElUniqueToLowerCaseSortByLenght(List<String> myList){
        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())). // Comparator.comparing Karsilastirici Class'dir. Karsilastirma sartlarini biz belirleyecegimiz zaman kullaniriz.
                forEach(t -> System.out.print(t + " "));
    }
}
