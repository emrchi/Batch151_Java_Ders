package b151practices.day_18practice;

import java.util.*;

public class C02_Iterator {

    //Listin disindaki collection uyelerinde Iterator kullanilir. Index yapisi olmayan Collection uyelerinde kullanilir.

     /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */

    public static void main(String[] args) {


        Set<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4,5));  //Set interface oldugu icin constructor kisim tarafindan
        // override edilmeli bu yuzden new den sonra Set yazamayiz child olan Hash yada Tree Set olabilir.

        System.out.println(set); //[1, 2, 3, 4, 5]

        Iterator itr = set.iterator(); //Set'lerde index yapisi yoktur. Bu nedenle iterator kullanilir.

        while(itr.hasNext()){      //hasNext ile elemandan sonra baska bir eleman varmi diye kontrol ediyor. varsa true.
            Object sayi =itr.next();
            if((Integer) sayi %2==0){
                itr.remove();
            }
        }
        System.out.println(set); //[1, 3, 5]



    }

}
