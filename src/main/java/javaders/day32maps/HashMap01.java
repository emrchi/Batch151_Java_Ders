package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        stdAges.put("Tom", 83);

        //Maplerde keyler tekrarsiz olmali, ama valueler tekrarli olabilir.
        //HashMap'ler entry'leri rastgele siralarlar, bu yuzden cok hizli calisirlar.
        //Map'ler butun siralamalari key'lere gore yaparlar.

        System.out.println(stdAges); // {Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}  key'i (Tom) tekrarli kullandigimizda
                                     // hata vermez en son verilen entry'nin degerini kabul eder.Bu yontem value guncellemede kullanilabilir.
                                     // burada Tom=76 ==>83 yaptik. Buna "Overwrite" denir.

        //replace() value'lari keyleri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39); // ezel key'ine git value'sunu 38 den 39 a update et.
        System.out.println(stdAges); //{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        stdAges.replace("Angelina",58,61); //Methodu Map'in icinde "Angelina",58' varsa 58 i 61'e donusturur,yoksa donusturmez.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}
        stdAges.replace("Angelina",57,61);
        System.out.println(stdAges); //{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        stdAges.putIfAbsent("Brad", 60); //Methodu Map'in icinde "Brad" key olarak yoksa ekliyor varsa eklemiyor.
        System.out.println(stdAges); //{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}
        stdAges.putIfAbsent("Ali" ,60);
        System.out.println(stdAges); //{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //getOrDefault() methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault() methodu Map'de varolan "key"ler icin ikinci parametreye koydugunuz degeri
        //"get() methodu" ise null verir.

        System.out.println(stdAges.get("Tom")); //83
        System.out.println(stdAges.getOrDefault("Tom",0)); //83

        System.out.println(stdAges.get("Ayse")); //null
        System.out.println(stdAges.getOrDefault("Ayse", 0)); //0

        System.out.println(stdAges.containsValue(77)); //true   value'larin arasinda 77 varmi?
        System.out.println(stdAges.containsValue(99)); //false  value'larin arasinda 99 varmi?

        System.out.println(stdAges.containsKey("Ali")); // true key'lerin arasinda "Ali" varmi?

        //remove("Ali") methodu "key" kullanarak "entry" i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom",81) methodu map de key'si "Tom" value'su 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom",81);
        System.out.println(stdAges); //{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        System.out.println(stdAges.size()); //5

        HashMap<String,Integer> kidsAges = new HashMap<>();
        kidsAges.put("John", 12);
        kidsAges.put("Jim", 22);
        kidsAges.put("Jack", 32);


        //stdAges.putAll(kidsAges); methodu stdAges Map'ine KidsAges map'ini ekler.
        //Dolayisi ile stdAges Map'i degismis olur. Ama kidsSAge Map'i degismez.
        stdAges.putAll(kidsAges);
        System.out.println(stdAges); //{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAges); //{John=12, Jack=32, Jim=22}



    }
}
