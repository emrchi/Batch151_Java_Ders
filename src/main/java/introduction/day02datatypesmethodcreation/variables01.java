package introduction.day02datatypesmethodcreation;

public class variables01 {
    /*
    Java'da temel de iki tip data vardir.
    1)primitive data type:
       car, boolean, byte, short, int, long, float, double
    2)non-primitive data type:
         String
     */
    /*
    Note1: primitive data type'lari java olusturmustur, biz olusturamayiz.
    Note2: primitive data type'larin isimlerinde sadece kucuk harf kullanilir.
    Note3: primitive data'lar type'larina gore memory' de farkli farkli yer kaplarlar.
    Note4: primitive data'lar iclerin de sadece sizin atadiginiz degeri barindirirlar.

     */
    /*
    Non-primitive Data Types
       String
       Uretilen her bir class ayni zaman da bir "non-primitive data type" dir.
       Bu yuzden "non-primitive data type" lar sinirsiz sayidadir denilebilir.
       Non-primitive data type larin isimleri buyuk harfle baslar.
       Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.

     */
    public static void main(String[] args) {
        //Ornek1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yzdirin

        String cityName = "Newyork";
        System.out.println(cityName);
        int a =13;

        /*
            Interview sorusu: "primitive" ve "non-primitive" data type'lar arasinda ki farklar nelerdir?
            1) "pirimitive" ler sadece bizim atadigimiz degeri icerir
               "non-pirimitive" ler bizim atadigimiz deger ve metodlar icerir.
            2) pi.ler kucuk hafle baslar npi. ler buyuk harfle baslar
            3) pi. leri java uretmistir ve 8 adettir. npi. leri java ve devoloperlar uretebilir,sinirsiz sayidadir.
            4) primitive data'lar type'larina gore memory' de farkli farkli yer kaplarlar.
               Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
         */



    }
}
