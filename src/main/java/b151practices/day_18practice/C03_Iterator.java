package b151practices.day_18practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class C03_Iterator {

    public static void main(String[] args) {

        /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız
       */

        /*
        List disindaki collection uyelerinde index yapisi olmadigi icin burada ki Deque i Iterator'a cevirmeliyiz.
         */


        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(8);
        deque.add(3);
        deque.add(6);
        deque.add(7);
        System.out.println(deque); // [1, 8, 3, 6, 7]

        Iterator itr = deque.iterator();

        while (itr.hasNext()){
            Object sayi = itr.next();
            if ((Integer)sayi>5){
                System.out.print(sayi + " "); // 8 6 7

            }
        }





    }
}
