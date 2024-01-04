package javaders.day40_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> iller = new ArrayList<String>(Arrays.asList("Van","Mus","Gumushane","kutahya","Ankara","Ordu","Mus","Gaziantep","Hatay","Edirne"));

        bykHrfLenghtArtTrsz(iller);
        System.out.println();
        bykHrfSonHrfArtTrsz(iller);
        System.out.println();
        bykHrfLenghtArtTrszAlf(iller);
        System.out.println();
        System.out.println(silKrt5TenBuyuk(iller)); //4) [Van, Mus, Ordu, Mus, Hatay]
        System.out.println();
        System.out.println(silHbasUbit(iller)); //5) [Van, Mus, Mus]
        System.out.println();
        lenghtOfChKare(iller); //6) 9 9 9
        System.out.println();
        System.out.println(listOfCiftCharacter(iller)); //7) []


    }

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLenghtArtTrsz(List<String> iller){
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHrfArtTrsz(List<String> iller) {
        System.out.print("2) ");
        iller.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    /*
    Yukaridaki sorularda lambda "Lambda Expresiton" kullandik.
    Bu soruda ise ayni islevi yapan "metod referans yontemi" ile yapalim.
    bu yontemde :: ile method cagiriyoruz.
     */

    public static void bykHrfLenghtArtTrszAlf(List<String> iller) {

        System.out.print("3) ");

        iller.stream().
                distinct().
                map(String :: toUpperCase). //Buda map(t -> t.toUpperCase()) ile ayni isi yapiyor
                sorted(Comparator.comparing(String ::length). //Buda sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))). ile ayni isi yapiyor.
                thenComparing(Comparator.naturalOrder())).  // thenComparing methodu ikinci kez sorted methodunu calistirmak icin.
                forEach(System.out ::println); //Buda forEach(t -> System.out.print(t + " "));  ile ayni isi yapiyor.

    }


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz.

    public static List<String> silKrt5TenBuyuk(List<String> iller){
        System.out.print("4) ");
        iller.removeIf(t-> t.length() > 5);

        return iller;
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

    public static List<String>silHbasUbit(List<String> iller){
        System.out.print("5) ");
        iller.removeIf(t-> t.startsWith("H") || t.endsWith("u"));

        return iller;
    }



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin

    public static void lenghtOfChKare(List<String> iller){
        System.out.print("6) ");
        iller.stream().map(t -> t.length()*t.length()).forEach(t-> System.out.print(t + " "));


    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> listOfCiftCharacter(List<String> iller){
        System.out.print("7) ");
        iller.removeIf(t -> t.length()%2!=0);
        return iller;
    }

}
