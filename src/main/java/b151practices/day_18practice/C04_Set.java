package b151practices.day_18practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan tekrarsiz olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,4,5};

        System.out.println(Arrays.toString(benzersizYap(arr))); // [1, 2, 3, 4, 5]
    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> tekrarsizSet = new TreeSet<>(); //Set Unique oldugu icin tekrarsiz oldugu icin sectik.
                                                     //Set'ler de index yapisi olmadigindan forloop kullanamam foreach kullanmaliyim.

        for (int each : arr) {

            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet); //[1, 2, 3, 4, 5]

        int arr2[] = new int[tekrarsizSet.size()];

        int idx = 0;

        for(Integer each :tekrarsizSet){            //Burada arr2 arrayine her index icin setden eleman almaliyim
                                                    // fakat setde index olmadigi icin kendin idx olusturup loopun her adiminda 1 arttirdim.
            arr2[idx] = each;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));  //[1, 2, 3, 4, 5]

        arr = arr2;


        return arr;

    }


}
