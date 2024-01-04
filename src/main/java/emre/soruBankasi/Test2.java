package emre.soruBankasi;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    //Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
    //olup olmadığını kontrol ediniz.

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(54);
        myList.add(54);

        int counter = 0;
        for (Integer w : myList){

            if(myList.indexOf(w)!=myList.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Elemanlar benzersizdir");
        }else{
            System.out.println("Elemanlar benzerlidir");
        }

    }




}
