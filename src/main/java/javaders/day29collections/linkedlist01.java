package javaders.day29collections;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist01 {

    /*
    1)Linklist'ler node silme ve ekleme'de cok basarili olduklari icin,
      silme ve ekleme islemlerinin coklukla yapilacagi xaman LinkList kullanilmalidir.
    2)ArrayList'ler index'leri adres gibi kullanir, bu nedenle ArrayList'ler "search" islemlerinde cok basarilidirlar.
    Not: ihtiyaciniz olan  collection cogunlukla silme ve ekleme islemleri yapacaksa (muze ziyaretleri gibi) LinkList,
        "search" islemleri yapacaksa(Amerika eyaletleri gibi)ArrayList kullaniniz


     */

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        s.add("Esra");
        s.add("Esra");

        System.out.println(s); //[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar, Esra]

        s.remove(2); //ajda
        System.out.println(s); //[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar, Esra]

        s.remove(); //Kemal
        System.out.println(s); //[Steve, Esen, Muge, Cuneyt, Esra, Ajdar, Esra]

        s.removeFirstOccurrence("Esra");
        System.out.println(s); //[Steve, Esen, Muge, Cuneyt, Esra, Ajdar, Esra, Esra]

        s.removeLastOccurrence("Esra");
        System.out.println(s); //[Steve, Esen, Muge, Cuneyt, Ajdar, Esra]

        /* peek()
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */

        String r1 = s.peek();
        System.out.println(r1); // Steve    ilk node'u silmeden bize verir (copy paste)
        System.out.println(s);  // [Steve, Esen, Muge, Cuneyt, Ajdar, Esra]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */

        String r2 = s.poll();
        System.out.println(r2);// Steve ilk node'u bize verdi ve sildi (cut paste)
        System.out.println(s); // [Esen, Muge, Cuneyt, Ajdar, Esra]

        /* element()
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty
        Note: peek() ile element() ikisi de ilk elemani silmeden size verir.
            Ama peek() list bos oldugunda size "null" verir, element() ise "hata" verir.
         */

        String r3 = s.element(); //ilk node'u silmeden bize verir (copy paste)
        System.out.println(r3); // Esen
        System.out.println(s);  // [Esen, Muge, Cuneyt, Ajdar, Esra]

        /* pop()
        removes and returns the first element of this list.
        This method is equivalent to removeFirst().
        Throws:NoSuchElementException – if this list is empty
        Note: poll() ile pop() ikisi de ilk elemani siler ve size verir.
            Ama poll() list bos oldugunda size "null" verir, pop() ise "hata" verir.
         */

        String r4 = s.pop();
        System.out.println(r4); // Esen
        System.out.println(s); // [Muge, Cuneyt, Ajdar, Esra]

        Collections.sort(s);
        System.out.println(s);




    }



}
