package emre.soruBankasi;

import java.util.*;

public class Test4 {

    //2)Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.

    public static <LinkedHashSetSet> void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(4);
        mySet.add(1);
        mySet.add(17);
        mySet.add(7);
        mySet.add(45);

        mySet.retainAll(myList);
        System.out.println(mySet);
        System.out.println(myList);


        //3)Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        //Örnek: ‘Mississippi’ ´ Misp

        String sehir = "Mississippi";

        LinkedHashSet<Character> mySehirSet = new LinkedHashSet<>();

        for (int i = 0; i < sehir.length(); i++) {
            mySehirSet.add( sehir.charAt(i));
        }
        System.out.println(mySehirSet);

        //2.yol:

        String s = "Mississippi";

        String arr[]=s.split("");

        List<String> list1= Arrays.asList(arr);

        Set<String> set1 = new LinkedHashSet<>(list1);

        System.out.println(set1);

        //4)Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran bir kod yazınız.

        List<Integer> list= new ArrayList<>(Arrays.asList(4,12,23,45,67,89));
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(25);
        set.add(32);
        set.add(67);

        set.removeAll(list);
        System.out.println(set);

        //5)
        //Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.

        List<Integer> list2= new ArrayList<>(Arrays.asList(4,12,23,45,89,4));

        HashSet<Integer> set2 =new HashSet<>(list2);
        if (list2.size()==set2.size()){
            System.out.println("Elemanlar tekrarsizdir");
        }else{
            System.out.println("Elemanlar tekrarlidir");
        }





    }

}
