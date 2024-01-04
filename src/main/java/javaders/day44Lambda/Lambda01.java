package javaders.day44Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Ex1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).forEach(t-> System.out.println(t)); //Java expretions
        Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).forEach(System.out :: println); //method reference

        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik

        //Ex2: Verilen text file icindeki text'i  buyuk harflerle console'a yazdiran code'u yaziniz.

        Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3 : Verilen text file icindeki text'i "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
        boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).anyMatch(t-> t.contains("Java"));
        System.out.println(r1);

        /*
        Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiracagiz.
        files.Lines(Paths.get ve devami bize bir stream verir. sirasiyla map kullanacagiz.
        Varolan satirlar buyuk harfle yazilacagindan, yapilari degiseceginden map kullandik.
        Map icinde String::toUpperCase ile harflerin tamami buyuk harfe cevrildi ve sonrasinda forEach ile yazdirdik.

        Example 3:Text'imiz icinde "Java" kelimesi var mi diye bakacagiz.
        Basta files.lines kismini yazdik. Sonra anyMatch methodu ile Java kelimesini aradik.
        Aramayi yaparken contains("Java") yazdik. anyMatch bize boolean vereceginden
        bir boolean conteyner olusturup files ve devamini o boolean'a assign ettik.
        Burada forEach degil yazdirmayi sout ile yaptik. Sout icine boolean'in ismini
        yazdik.
         */

        //Example 4 : Verilen text file icindeki text'lerde kullanilan fakli kelimeleri bir List icinde return ediniz.

        List<String> words = Files.
                                   lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).
                                   map(t-> t.replaceAll("\\p{Punct}", "").split(" ")).
                                   flatMap(Arrays ::stream).   //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik
                                   distinct().
                                   collect(Collectors.toList());
        System.out.println(words);
        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

         long numOfLetters = Files.
                 lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).
                 map(t -> t.replaceAll("[^a-zA-Z]", "")).
                 map(t-> t.split("")).
                 flatMap(Arrays ::stream).
                 count();
        System.out.println(numOfLetters);

        /*
        Example 5: Text icindeki text'de toplam kac harf oldugunu bulacagiz.

        Once Files.lines...ile textimizi aldik. Harfler disinda ne varsa silebilmemiz icin map metodu icinde
        replaceAll metodunu kullandik. Bu defa bir map icinde birden fazla metod kullanmak yerine ikinci bir map
        metodu yazdik ve icinde split metodunu kullanarak hicliklerden kelimeleri degil, harfleri aldik. Elimizdeki
        harfler bir stream'in ve array'in icinde. Bu elemanlara ulasmak icin array parantezini kirmak icin flatMap
        metodunu yazdik. flatMap icine Arrays::stream yazarak elemanlara ulastik. Devaminda count () metodu kullanmaya
        karar verdik. Cunku bu metod ile toplam harf sayisini alabiliriz. count metodu bize long verir.
        Biz de tum kodumuzu yeni olusturdugumuz long numOfLetters conteynerina assign ettik.
        Son olarak sout icine numOfLetters koyarak kodumuzu calistirdik.
        lambda da bazi metodlar kendisinden sonra metod gosterir, bazi metodlar son kullanim amacli olup, ondan sonra
        baska metod kullanamiyoruz. Ornek anyMatch() ya da count(), forEach() yanlarina nokta koyunca baska metodlari
        ekranda sirali halde goremedik. count() gibi kendisinden sonra metod kullanilmasina musaade etmeyen metodlara
        terminal method denir.
         */

        /*
        Lambda da iki tür method var.
        1-Terminal Method: Kendisinden sonra method kabul etmez.sum(), count() gibi.
        2-Kendisinden sonra method kabul eden methodlar.
         */

        //Example : Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //           icinde return eden kodu yaziniz.


       List<String> letters = Files.
                                    lines(Paths.get("src/main/java/javaders/day44Lambda/myTextFile")).
                                    map(t -> t.replaceAll("[^a-zA-Z]", "")).
                                    map(t-> t.split("")).
                                    flatMap(Arrays :: stream).
                                    sorted(Comparator.reverseOrder()).
                                    collect(Collectors.toList());
        System.out.println(letters);


    }
}
