package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

    /*
    Bir method'u ogrenirken asagidaki 3 seyi ogrenin.
    1) o method ne is yapar?
    2) o method nasil kullanilir?
    3) o method size neyi verir?
     */

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities); //[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'de bir elementin ilk gorunumu nasil silinir? remove()

        //asagida bir method overload var remove() methodu uzerinde.
        //citiesi bir object olarak olusturdugumuz icin cities icindeki remove() methodu non-static method'dur.

        System.out.println(cities.remove("Miami")); //true
        System.out.println(cities.remove("istanbul")); //false  cunku List'in icinde silebilecegi "istanbul" yok.
        System.out.println(cities); //[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'de bir elemenT INDEX'I KULLANILARAK NASIL SILINIR?
        System.out.println(cities.remove(2)); //Barcelona
        System.out.println(cities); //[Giresun, Yozgat, Miami, Giresun]

        //ArrayList olustururken en basa ArratList yerine List de yazabiliriz. Sebebini Collections konusunda gorecegiz.
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Ex1: 12 element'ini List'den silin.

        //ages.remove(index : 12); //12 burada primitive int olur. Java onu index zanneder.
                                  // Javaya onun index olmadigini soylemek icin wrapper class Integer kullanmaliyiz
        ages.remove((Integer)12); // AutoBoxing yaptik

        System.out.println(ages); //[23, 7, 4]

        //Bir ArrayList'deki bir elemanin tum gorunumlerini nasil sileriz?
        //Silmek istedigimiz elementleri iceren bir yeni liste yaparak removeAll() method'u kullaniriz.
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities); //[Miami]



        //List.of() method'u elemmentleri kisa yolla Listeye eklemek
        // ve kisa yoldan Liste olusturmak icin kullanilabilir.

        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials); //[a, k, c, d, k]

        List<Character> letters = List.of('a','c','k','d','k');
        System.out.println(letters); //[a, c, k, d, k]

        //Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz?
        boolean r1 = initials.equals(letters);
        System.out.println(r1); //false cunku equals() method'u hem elementler aynimi
                                // hemde elementler ayni index'demi diye bakar yani iki ArrayList'in
                                // esit ayni olmasi icin hem elementlerin hemde elementlerin indexlerinin esit olmasi gerekir.

        //indexof('k') yazarsaniz 'k' nin ilk gorunumundeki index'ini verir.
        int r2 = initials.indexOf('k');
        System.out.println(r2); //1

        //lastIndexOf('k') yazarsaniz 'k' nin son gorunumundeki index'ini verir.
        int r3 = initials.lastIndexOf('k');
        System.out.println(r3); //4

        //Ex1: Bir listteki tekrarsiz elemanlari console'a yazdiran kodu yaziniz.

        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (Double w : prices){
            if(prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.print(w + " ");
            }
        }

        //Ex2: Bir List'de tekrarli eleman olup olmadigini gosteren kodu yaziniz?
        List<Double> heights = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        int counter = 0;
        for (Double w : heights){

            if(heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique in the list");
        }


    }
}
