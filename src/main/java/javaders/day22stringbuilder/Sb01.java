package javaders.day22stringbuilder;

public class Sb01 {

    /*
       1)"StringBuilder" String ureten bir Class'dir.
       2)String Class kullanarak String uretiriz. Java nicin "StringBuilder" Class'i da olusturdu?
       "String" class "imutable" (degistirilemez) String uretir, "StringBuilder" Class "mutable"(degistirilebilir)  String uretir.
       We sometimes need "mutable Strings" that is why Java created "StringBuilder" class.
       3)"immutable" olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir.
       "mutable" olmak demek orijinal degerin degistirilebilir olmasi demektir.
       4)"capacity" Java'nin size verdigi data depolama yer sayisidir.
           Length ise size verilen data depolama yerinin kullanilan kismidir.
        5)Java baslangic olarak size capacity'i 16 olarak verir.
          Siz verilen capacity'i asarsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.
        6) String Builder'larda her method kullanildiginda orjinal deger degisir.
           String'lerde method kullanildiginda orjinal deger degismez.
        7)StringBuilder is not "thread-safe" (being able to do "multiple thread(task)" at the same time) and is not "synchronized"
          "synchronized" means being able to select appropriate order for "multi thread"

           Note:
         toString - substring - charAt - subsequence methodlari yeni string olusturur. ORIJINAL degeri degistirmez.
         reverse - deleteCharAt - delete - setCharAt - replace - append - insert  orijinal degeri degistirir


    */

    public static void main(String[] args) {
        String s = "Java";
    //String class is immutable that is why when you do any update on "s", Java does not change the value in "s" container.
    //Java creates a new container for the updated value and puts the updated value in the new container.
        s.concat("!");
        String yeni = s + "!";
        System.out.println(s); //Java
        System.out.println(yeni);//Java!




    // StringBuilder nasil olusturulur?
    //Let us create a "Mutable" String

        String u = "Apex";
        String v = "Apex";
        String y = "C++";


        //1.Way:
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);//Python

        //StringBuilder'lar a nasil ekleme yapilabilir?
        //When I use any method to update StringBuuilder original value will be updated.
        t.append("!").append("..");
        System.out.println(t); //Python!..

        //2.Way:
        StringBuilder r = new StringBuilder();
        System.out.println();//hicbirsey
        r.append('c');
        System.out.println(r);//c


        //capacity ve lenght arasinda ki fark nedir?

        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println(capacity); //21

        int lenght = sb1.length();
        System.out.println(lenght); //"Money" ==> 5

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println(c);// 21x2 + 2 ==> 44

        int ln = sb1.length();
        System.out.println(ln);// 23

        //Default capacity'i degistirebilirmiyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity()); //2

        sb2.append("...");
        System.out.println(sb2.length()); //3
        System.out.println(sb2.capacity()); //6 ==> capacity: 2*2+2


        sb1.insert(5," is love");   // ==> will skip first 5 characters, then insert " is love
        System.out.println(sb1); //Money is love!.................

        sb1.insert(6,"Wooow",0,3);  // ==> 6. karakterden sonra verilen stringi o dan 3. indexine kadar olan kismini ekledi
        System.out.println(sb1); //Money Woois love!.................

        sb1.replace(1,3,"1"); // ==> 1.index ile 3. index arasini  verilen yeni String'ile degistirdi.
        System.out.println(sb1); // M1ey Woois love!.................







    }
}
