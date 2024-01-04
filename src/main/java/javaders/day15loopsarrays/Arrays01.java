package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
        1. Array Java'nin ayni data type'inda coklu data depolamak icin olusturdugu bir yapidir.
        2. Arrayler "Primitive data type" lari veya "reference" lar ile calisir.
        3. Arrayler "Super fast" dir ve "memory'de cok az yer" kaplarlar.
        4. Eger isimizi Array'lerle yapabiliyorsak Array'leri tercih ederiz.
         */

        // Array nasil olusturulur?
        String  stdNames  [] = new String[5]; //java 5 kisilik yer ayirdi. Java lenght=5 yapti.
    // datatype arrayname [] = new String[kacadetyerayiracak]

        // Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null]<== Null'lar String'in default degerleridir.

        //Array'e nasil eleman eklenir?
        stdNames[0] = "Ajda";
        System.out.println(Arrays.toString(stdNames)); // [Ajda, null, null, null, null]
        stdNames[3] = "Cuneyt";
        System.out.println(Arrays.toString(stdNames)); // [Ajda, null, null, Cuneyt, null]
        stdNames[2] = "Kemal";
        System.out.println(Arrays.toString(stdNames)); // [Ajda, null, Kemal, Cuneyt, null]
        stdNames[1] = "Ayhan";
        System.out.println(Arrays.toString(stdNames)); // [Ajda, Ayhan, Kemal, Cuneyt, null]
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames)); // [Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        //Array'deki spesifik bir elemani nasil alabiliriz?
        System.out.println(stdNames[0]); // Ajda
        System.out.println(stdNames[1]); // Ayhan
        System.out.println(stdNames[2]); // Kemal
        System.out.println(stdNames[3]); // Cuneyt
        System.out.println(stdNames[4]); // Filiz

        //Ex1: stdNames array'indeki her ismin sonuna yildiz koyarak konsola yazdiriniz.
        //1. Way

        for(int i=0; i<stdNames.length; i++ ){ // lenght String'lerde parantezli(method) Array'lerde parantezsiz(!method) kullanilir.
            System.out.println(stdNames[i] + '*');
        }

        //2. Way: for-each loop ==> Enhanced(Zenginlestirilmis) loop - Mumkunse hep for-each loop kullanin
        // for each loop da her zaman ilk elemandan baslar son elemana kadar gider.
        // for each loop Array'ler de ve collections'larda  kullanilir. soz dizimi == for(String w : stdNames){}

        for(String w : stdNames){

            System.out.println(w + "*");

        }

        //Ex2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz Elemanlarin toplamini consola yazdiriniz.

        int ages [] = new int[5];
        System.out.println(Arrays.toString(ages)); //[0, 0, 0, 0, 0]
       ages[0] = 10;
       ages[1] = 20;
       ages[2] = 30;
       ages[3] = 40;
       ages[4] = 50;
        System.out.println(Arrays.toString(ages)); //[10, 20, 30, 40, 50]

        int sum = 0; // Burada 0 koyduk cunku 0 toplama isleminin etkisiz elemanidir.

       for (int w: ages){
         sum = sum + w;

       }
        System.out.println(sum);

        //Ex3: Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini consola yazdiriniz.

        char initials []  = new char[3];

        initials[0] = 'J'; //76 Ascii
        initials[1] = 'P'; //80 Ascii
        initials[2] = 'A'; //65 Ascii

        int multply = 1;  //Burada 1 aldik cunku 1 carpim isleminin etkisiz elemanidir.

        for (char w: initials){
            multply = multply * w;
        }
        System.out.println(multply);






    }
}
