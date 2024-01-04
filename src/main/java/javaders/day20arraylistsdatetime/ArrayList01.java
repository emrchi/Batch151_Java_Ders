package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList01 {

    /*
    1)String class kullanmak tercih edilir cunku String class method acisindan cok zengindir.
    2)List.Of() kullanarak kisa yoldan List olusturabilirsiniz ama
           i.bu List'in elemanlari degistirilemez.
           ii. bu list'lere yeni eleman eklenemez.
           iii.bu list'lerden eleman silinemez.
     */

    /*
    Ex1.: Kullanicinin girdigi harf List'de var ise
    o harfi "Buldum!" a ceviren yoksa o harfi List'e ekleyen kodu yazdirin.
    List'deki element sayisi kadar devam etsin oyun.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();


        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {
            if(counter == size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "Buldum!");
            } else {
                myList.add(letter);
            }
            counter++;

        }while(true);





    }
}
