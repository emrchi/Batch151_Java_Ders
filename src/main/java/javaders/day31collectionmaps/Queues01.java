package javaders.day31collectionmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {

        //Queue ==> Ilk giren urun ilk cikmalidir.  First In First Out (fifo) .Bankalardaki numaralandirma sistemi bu sekildedir.


        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("milk");
        wareHouse.add("meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse); //[milk, meat, Bread, Egg, Cheese]

        //Elemanlari verdigimiz siraya gore dizdi cunku constructer'i LinkListden aldi.


        wareHouse.remove();
        System.out.println(wareHouse); //[meat, Bread, Egg, Cheese]     first out yapti.

        System.out.println(wareHouse.peek()); //meat   first elementi bize silmeden verdi.
        System.out.println(wareHouse);  //[meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element()); //meat
        System.out.println(wareHouse); //[meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll()); //meat    first elementi bize silerek verdi.
        System.out.println(wareHouse); //[Bread, Egg, Cheese]

        wareHouse.clear();       //butun elementleri siler.
        System.out.println(wareHouse.poll()); //null
        System.out.println(wareHouse.remove());  //hata verdi cunku eleman yok. Exception.

    }



}
