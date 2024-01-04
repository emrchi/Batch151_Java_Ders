package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Array'leri kisa yoldan olusturmak.

        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades)); //[67, 98, 100, 34, 76]



        //Ex1. grades array'indeki en kucuk ve en buyuk grade'in toplamini yazdiriniz.

       Arrays.sort(grades); //  sort() methodu numeric elemanlari (datalari) kucukten buyuge(ascending) siralar.
        System.out.println(Arrays.toString(grades)); //[34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]); //134


        //note:
        // Application'larda "data" ile bu data'lari isleyen code'lar(Logic) birbirinden ayrilir.
        // her code'da iki kisim vardir data kismi ve logic(action) kismi.
        //Code da data kismi degisirse logic kisminin dogru calismaya devam etmesi gerekir. Eger iyi calismaz kirilirsa
        //bu code'a Hard code(sert egilip bukulmez) hatali code denir.
        //yukaridaki ngrades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
        // "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
        //  kullanirsaniz hep dogru sonucu alirsiniz.


        //Ex2: size verilen bir String array'deki isimlerden 5 karakterden az karakter icerenleri yazdiriniz.

        String names[] = {"Ajda", "Cuneyt", "Tom", "Ayhan", "Filiz"};
        for (String w:names) {
            if(w.length()<5){
                System.out.println(w);
            }

        }

        //Ex3: size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri yazdiriniz.

        Arrays.sort(names); // sort() methodu Stringleri alphabetik(alphabetically) sirada dizer.
                            // ascending+alphabetically ==> Natural Order
        for (String w:names) {
            if(w.charAt(0)!='F'){
                System.out.println(w);
            }else{
                break;
            }
        }

        //yada
        Arrays.sort(names);
        for (String w:names){
            if(w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }

        //Ex4: size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri ve "F" ile baslayanlari yazdiriniz.

        Arrays.sort(names);
        for (String w:names){

            System.out.println(w);

            if(w.startsWith("F")){
                break;
            }

        }

        //Ex5: size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimler haric diger isimleri console'a yazdiriniz.

        Arrays.sort(names);
        for (String w:names){
            if(!w.startsWith("F")){
                System.out.println(w);
            }
        }
       // yada

        Arrays.sort(names);
        for (String w:names){
            if(w.startsWith("F")){
                continue;
            }else{
                System.out.println(w);

            }
        }








    }

}
