package javaders.day30collectionsSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
        /*
    Set tekrarsiz elemanlar ornegin email adresleri, tel no, kimlik nolarini depolamak icin Set kullanilir.
HashSet ve devami ne zaman kullanilir.
HashSet setlerin en hizlisi olup hiz ihtiyaci olunca bunu kullanin
LinkedHashSet elemanlarin girilen siraya gore dizilmesi icin kullanilir.
TreeSet elemanlari natural order'a gore dizmek icin kullanilir
     */
    /*
    2)3 tane Set class vardir;
        i)HashSet class:
            Hash Benzersiz id olusturma teknigidir. Bu teknige "Hashing technique" denir.
            "HashSet" elemanlari rastgele siralar.
            "HashSet" elemanlari siralamadigindan cok hizli calisir.
            "HashSet"ler "null"i eleman olarak kabul eder.
            "HashSet"ler tekrarsiz eleman depolamak icindir.
        ii)LinkedHashSet class:
            "LinkedHashset" ler elemanlari sizin verdiginiz siraya gore dizdiklerinden (Insertion Order) "Hashset"lere gore yavastirlar.
            "LinkedHashSet"ler tekrarsiz eleman depolamak icindir.
        iii)TreeSet class:
            "TreeSet'ler elemanlari natural order'a gore dizerler.
            "TreeSet"ler elemanlari natural order'a gore dizdiklerinden cooooook yavastirlar.
            En yavas Set "TreeSet"tir.
    3)TreeSet Class cok yavas oldugundan kullanmamaya calisiriz

            Butun connection'lar Nonprimitive kullanir.
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Zeki");
        hs.add("Esra");
        hs.add("Ezel");
        hs.add("Cuneyt");  // Tekrarli eleman eklendiginde hata vermez ama tekrarli elemani sadece bir kere set'e ekler.
        hs.add(null);
        hs.add(null);

        System.out.println(hs); //[null, Zeki, Ajda, Cuneyt, Esra, Ezel]  rastgele siraladi

        System.out.println(hs.hashCode()); //2038751948 hs hashseti icin Javanin urettigi id.


        LinkedHashSet<Integer> lhs =    new LinkedHashSet<Integer>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);
        lhs.add(null);

        System.out.println(lhs); //[234, 87, -32, 124, null] girdigimiz siraya gore siraladi

        LinkedHashSet<Integer> ls =    new LinkedHashSet<Integer>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls); //[451, 87, 231, 124]

        lhs.retainAll(ls);   //ortak olanlari muhafaza et manasinda
        System.out.println(lhs); //[87, 124]   ==>   ilk linkhashset'deki farkli elemanlar silindi
        System.out.println(ls);  //[451, 87, 231, 124] ==> ikinci linkhashset'e dokunmadi

        TreeSet<Character> ts = new TreeSet<Character>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('U');
        //ts.add(null); TreeSet'lere null eklenemiyor. cunku alfabetik siraya gore dizdigi icin nereye koyacagini bilemiyor :)

        System.out.println(ts); // [A, G, R, U, Z] alfabetik siraya gore siraladi

        System.out.println(ts.first()); // A
        System.out.println(ts.last()); //Z

        System.out.println(ts.lower('R')); // G ==> verilen eleman olan R'nin bir onceki elemani  verdi
        System.out.println(ts.lower('D')); // A ==> verilen eleman olmasa da olmasi durumunda olacagiu yerdekinden bir oncekini verdi
        System.out.println(ts.lower('A')); // null

        System.out.println(ts.higher('K')); // R ==> verilen K 'den sonraki elemani verir

        System.out.println(ts.headSet('R')); //[A, G] verilen eleman haric elemana kadarki elemanlari set seklinde verir
        System.out.println(ts.headSet('R',true)); //[A, G, R] verilen elemani'da dahil etmek icin true yazdik

        System.out.println(ts.tailSet('G')); //[G, R, U, Z] verilen eleman dahil elemandan sonraki elemanlari set seklinde verir
        System.out.println(ts.tailSet('G',false)); //[R, U, Z] verilen elemani dahil etmemek icin false yazdik

        System.out.println(ts.ceiling('R')); //R ==> Eleman Set'in icinde varsa elemanin kendisi return eder.
        System.out.println(ts.ceiling('K')); //R ==> Eleman Set'in icinde yoksa sonraki elemani return eder.

        System.out.println(ts.floor('G')); //G ==> Eleman Set'in icinde varsa elemanin kendisi return eder.
        System.out.println(ts.floor('J')); //G ==> Eleman Set'in icinde yoksa onceki elemani return eder.

        System.out.println(ts.subSet('G','U')); //[G, R] ==> ilk eleman dahil ikinci eleman haric.
        System.out.println(ts.subSet('G',false,'Z',true)); //  [R, U, Z]










    }
}
