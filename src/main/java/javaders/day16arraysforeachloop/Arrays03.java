package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        // Spesifik bir elemanin Array'de olup olmadigini anlamak icin gerekli kodu yaziniz.
        // String deki contains methiodu gibi

        String names [] = {"K", "C", "R", "A", "S"};

        String elements ="R";

        //1Way:

        int counter = 0;

        for(String w: names){
            if(w.equals(elements)){
                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("Array has " + elements);
        }else{
            System.out.println("Array dose not have " +  elements);
        }

        // 2.Way: binarySearch() methodu.  Hizli arama yapar.


        //Javanin array icindeki spesifik bir elemenani olup olmadigini bulmak icin yaptigi method
        //Arrays.binarySearch(icinde aramak yapilacak array ismi , arrayde aranacak eleman   )

        //1. binarySearch() methodunu sort() methodu kullanmadan kullanmayiniz. Cunku binarySearch() mantigi sirali elemanlar icin gecerlidir.
        //2. binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir.
        //3. binarySearch() methodun'dan aldiginiz index 0 veya 0' dan buyuk ise bu eleman Array'de var demektir.
        //4. binarySearch() methodu olmayan elemanlar icin negative tam sayi degeri '-'"sayi" -> verir
        // '-' isaretinin anlami o eleman yok demektir. "sayi" ise o eleman eger olsaydi kacinci eleman olurdu demektir.

        Arrays.sort(names);  // ["A","C","K","R","S"]
        int result = Arrays.binarySearch(names, elements);
        System.out.println(result);

        if(result<0){
            System.out.println("Array dose not have " +  elements);
        }else{
            System.out.println("Array has " + elements);

        }



    }

}
