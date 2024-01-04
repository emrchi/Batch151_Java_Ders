package emre.soruBankasi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test3 {

    //Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
    //Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);

        HashSet<Integer>myListSet = new HashSet<>(myList);

        System.out.println(myListSet.size());



    }


}
