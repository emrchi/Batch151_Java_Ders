package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {

    /*
    1)Ayni data type'indaki coklu data'lari depolamak icin Array kullaniriz.
    2)Array'lerin bir negatif yonu var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
    3)Array'ler eleman sayisinda esnek degildirler bu yuzden Java "ArrayList' adli yeni bir yapi olusturdu,
      bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
      1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
    4)"ArrayList" yerine sadece "List" de diyebiliriz.
    5)Java ArrayList'leri olusturduktan sonra Array'leri iptal etmedi cunku;
        i)Array'ler super hizlidir.
        ii)Array'ler memory'de coook az yer kaplar.
    6)Array'ler primitive data type'leri ve reference'lari depolayabilir. ondan dolayi az yer kaplarlar.
      ama 'ArrayList" ler "non-primitive" data type'larini depolar bu yuzden "ArrayList" ler "Array" lerden daha cok yer kaplar.
      "ArrayList" olustururken non-primitive data type kullanmaliyiz mesela bir ogrenci sayisini depolamak icin bir Arraylist
      olusturacaksak int degil wrapper int data type (non-primitive) kullanmaliyiz.
     */

    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>(); // buradaki ages bir objedir. new yazarak yeni ages objesi olusturduk.

        //ArrayList console'a nasil yazdirilir?
        System.out.println(ages); // [ ]

        //ArrayList'e eleman nasil eklenir?
        //1.Way
        ages.add(12);
        ages.add(24);
        ages.add(9); //add() methodu elemanlari giris sirasina (insertion order) gore listeye yerlestirir.
        System.out.println(ages); // [12, 24, 9]

        //2.Way
        ages.add(1,99); // Istedigimiz yere istedigimiz elemani indexine gore yerlestirmek icin
        System.out.println(ages); //[12, 99, 24, 9]


        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(32);

        //3.Way   addAll() method'u bir list'i diger bir list'in icine yerlestirir.
        ages.addAll(price); // price listesindeki butun elemanlari ages listesine koyacak.
        System.out.println(ages); //[12, 99, 24, 9, 23, 32]

        //4.Way
        ages.addAll(3,price);
        System.out.println(ages); //[12, 99, 24, 23, 32, 9, 23, 32]

        //ArrayList'de eleman sayisi nasil bulunur? size() method'u
        int numOfElement = ages.size(); // size() method'u bir listedeki eleman sayisini verir.
        System.out.println(numOfElement);// 8

        //ArrayList'de specific bir eleman nasil alinir? get() method'u
        int el1= ages.get(3); // get() method'u index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(el1);//23

        //ArrayList'de specific bir eleman nasil degistirilir? set() method'u
        ages.set(6,111); //ages listinde indexi6 olan elemani bul 111 ile degistir.
        System.out.println(ages); //[12, 99, 24, 23, 32, 9, 111, 32]

        //ArrayList'de specific bir elemanin var olup olmadigini sorgulamak. contains() method'u
        boolean result1 = ages.contains(99);
        System.out.println(result1); //true

        //Bir ArrayList'in bos olup olmadigini nasil kontrol ederiz? isEmty() method'u
        boolean result2 = ages.isEmpty();
        System.out.println(result2); //false

        //Bir ArrayList'deki tum elemanlari nasil sileriz? clear() method'u
        ages.clear();
        System.out.println(ages); //[]

        boolean result3 = ages.isEmpty();
        System.out.println(result3); //true

        //ex1: Bir list'in bos olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.Way
        if(names.size()==0){
            System.out.println("List is emty");
        }else{
            System.out.println("List has at list one element");
        }

        //2.Way: recommended
        if(names.isEmpty()){
            System.out.println("List is emty");
        }else{
            System.out.println("List has at list one element");
        }
        //iki yolda calisir fakat ikinci yol tavsiye edilir cunku ilkinde java size'i hesaplamak
        // ve karsilastirmak zorunda ve iki is yapmak zorunda.
        //ikincide hazir isEmpty() method'u var bu is icin.

    }
}
