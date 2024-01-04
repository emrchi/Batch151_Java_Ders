package emre.soruBankasi;

import java.util.*;

public class Test7 {

    //Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        HashMap<Integer, Integer> kontrol = new HashMap<>();

        for (Integer w : myList) {
            if (!kontrol.containsKey(w)) {
                kontrol.put(w, 1);
            } else {
                kontrol.replace(w, kontrol.get(w) + 1);
            }

        }
        Set<Map.Entry<Integer, Integer>> entries = kontrol.entrySet();

        for (Map.Entry<Integer, Integer> w : entries) {
            if (w.getValue() != 1) {
                System.out.print(w + " ");


            }
        }
    }
}