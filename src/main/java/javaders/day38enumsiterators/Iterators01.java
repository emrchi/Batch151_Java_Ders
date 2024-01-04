package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
    1)Iterator'lar loop'larin yaptigi ayni isi yapar. cunku loop'larda sonsuz loop tehlikesi var.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
    4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir.
    5)iki tip Iterator var:
        i)Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya eleman degistirmek mumkun degildir.
        ii)ListIterator: Bu eleman silebilir, eleman ekleyebilir ve degistiriebilir.
        Note: "Iterator" sadece soldan saga (ilk elemandan son elemana) calisir
              "ListIterator" ise iki yonlu calisabilir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]

        //"Iterator" kullanalim  ==> sadece eleman silmede kullanilir.

        Iterator<String> myItr =  myList.iterator(); //Burada mylist'imizi Iteratore cevirdik.

        while (myItr.hasNext()) { //hasNext(); Iterator'da  pointer'a senden sonra eleman var mi yok mu onu sorar.
                                  // varsa True yoksa false dondurur.

            myItr.next();         //next();Iterator'da bir sonraki elemani almak icin kullanilir.
                                  //pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.remove();       //next() methodunun return ettigi elemani siler.
        }
        System.out.println(myList); // []

        //"ListIterator" kullanalim

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList); //[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {

            String el = yourListItr.next();
            yourListItr.set(el + "!");
        }
        System.out.println(yourList); //[Tom!, Jim!, Clara!, Angie!, Mark!]

        //hasPrevious() ve previous() nasil kullanilir?

        while (yourListItr.hasPrevious()) {
            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);

        }
        System.out.println(yourList); //[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]

        //hasPrevious() ve Previous() i kullanabilmek icin pointer'in en sonda olmasi gerekir.
        //hasPrevious(); pointer'a "Senden once eleman var mi?" diye sorar.
        //Eleman varsa "true" yoksa "false" return eder. Bu method sagdan sola dogru calisir
        //previous() pointer'i bir onceki elemanin onune tasir ve ustunden atladigi elemani return eder.


        //enson'dan en basa nasil iterate edebiliriz?

        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList); //[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> ourListItr = ourList.descendingIterator(); //descending iterator() methodu ile direk tersden
                                                                    // isleme baslayabiliyoruz. Fakat listemiz LinkedList olmali.
                                                                    //descendingIterator() otomatik olarak pointer'i en sona koyar ve islem sondan baslar
        while (ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.print(el); //MarkAngieClaraJimTom
        }







    }
}
