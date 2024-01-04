package javaders.day31collectionmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class HashMap01 {

    /*
    Hash Benzersiz id olusturma teknigidir. Bu teknige "Hashing technique" denir.
    Map Java'da sozluk manasindadir.
    Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
    "key" kismi tekrarsiz, "value' tekrarli olabilir.
    Mapler "key" ve "value" structur'ini kullanir.
    Map'lerdeki elemanlara "entry" denir.
    Elemanlarin tamanina ise "entry set" denilir.
    Entry'ler Tekrarsiz  oldugu icin "Entry Set" denilir
    "Key" ve "Value' lar ayri ayri data type'larinda olabilirler.
    HashMap'ler entry'leri rastgele siralar bu yuzden en hizli map'tir.
    "Map"ler collection degildir. Farkli bir yapidir.


      KEY      =   VALUE
    Tekrarsiz  =  Tekrarli

       Cat     = Evcil hayvan
       Dog     = Evcil hayvan
     Crocodile = Timsah

     */

    public static void main(String[] args) {
        //Map nasil olusturulur:
        HashMap<String,Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir:
        countryPopulation.put("Germany",83000000); //HashMap'lerde add() methodu yerine Put() method'u vardir.
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation); //{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        //get() methodu "key" ile calisir ve size "value" kismini verir.
        int GermanyPopulation = countryPopulation.get("Germany");
        System.out.println("GermanyPopulation = " + GermanyPopulation); //GermanyPopulation = 83000000


        // Butun Key'leri nasil alabilirim? keySet() methodu Tum "Key" leri bize Set'in icine koyarak verir.
        // Cunku Key'ler tekrarsizdir vemtekrarsiz elementler Set'de listelenir.
        System.out.println(countryPopulation.keySet()); //[Turkiye, Netherland, USA, Germany, Albania]

        //Butun Value'lari nasil alabilirim? values() methodu
        Collection<Integer> values = countryPopulation.values(); //.values un uzerine gelip cntrl ye basip icine girerek data type'ini oradan ogreniriz.
        System.out.println(values); //[83000000, 18000000, 400000000, 83000000, 3000000]

        //Ex1: Country population map'indeki ulkelerin nufuslarinin toplamini bulunuz.

        Collection<Integer> value = countryPopulation.values();
        int sum = 0;
        for (Integer w : value) {
            sum =sum + w;
        }
        System.out.println(sum/value.size()); //117400000

        //entrySet()  Entry'leri alir kalip halinde set'in icine koyar bize verir.
        //Loop'lar Map'larde calismaz.Entry'leri kullanarak  loop yapmak istersek once set'e ceviririz.
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries); //[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        //Ex2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.

        int toplam = 0;
        for (Map.Entry<String,Integer> w : entries) {
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);   //587000034

    }
}
