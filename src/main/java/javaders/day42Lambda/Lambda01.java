package javaders.day42Lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");
        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));
    }
    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]

    public static List<String> sortWithLastCharDistinctUpperInList (List<String> names){
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//Normalde distinct elemanlari depolamak icin "Set" kullanilir.
        // ama Lambda'daki collect(Collectors.toSet()); methodu elemanlari
        //rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
        //Bu yuzden mecburen collect(Collectors.toList()); kullandik
        //Sonucu bir List icinde gormek isterseniz collect(Collectors.toList()) methodu kullanilir.
    }


    //Example 2:List elemanlarini character sayiarina gore ters sirada kucuk harfle bir list'in icinde return ediniz.
    //          Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    //          [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> Alexander,Michael,Alex,Alex, Mary,Jim,Tom]
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }
    //Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden method'u olusturunuz.




   /*Bu soruda yeni olan seyler: allMatch methodu, elemanlarin karakter sayilarina bakip 2'den buyuk mu diye kontrol edecegiz.
        Bunu normalde for each loop ile yapabiliriz. Ancak simdi Lambda ile cozecegiz.
        Methodun return type'nin boolean olmasi mantikli. Parnatezi icine listimizi koyduk.
        Sirasiyla names.stream().allMatch(t->t.length()>2)
        Sorumuzda elemanlarin tamami dendiginden allMatch methodunu sectik. Herbir elaman alinacak ve karakter sayilarina
        bakacak, 2'den buyukse true verecek aksi halde false verecek.
   */

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.



    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.



      /* Match
        allMatch() ==> tum elemanlar sarti saglarsa true dondurur
        anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
        noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
     */


}