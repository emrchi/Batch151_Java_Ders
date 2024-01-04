package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {

        /*

        Java da islem yaptiran
        ==  Esittir
        !=  Esit degildir
        <   Kucuktur
        >   Buyuktur
        =   Atama operatoru
        &&  And operatoru
        ||  Or operatoru

        1< 4 <5  ==> matamatik 3 lu karsilastirma yapabilir fakat Java uclu kiyas yapamaz
        1<4 && 4<5; ==> Java bu sekilde ikili kiyas yapip mantik operatorleri ile birlestirme yapar.

        && ==> and,ve,hem operatoru. mukemmeliyetci yapidadir. True dondurmesi icin her iki sartin da saglanmasi gerekir.
        || ==> Or,veya operatoru Polyannaci yapidadir. En ufak bir pozitif durum da True dondurur.


        & ile  && arasindaki fark
        (3<5 && 3<9 && 11<2 && 4<8 && 2<3 )
        cift && operatoru kodun tamamina bakmadan ilk gordugu False degerinde False dondurur
        Bu nedenle tek & operatorune gore daha hizli calisir
        Tek & operatoru tum kodu tarar tek bir false var ise false dondurur
        ama bunun icin tum kodun bitmesini bekler.Bu nedenle &&
        operatorune gore daha yavas calisir
        (3<5 & 3<9 & 11<2 & 4<8 & 2<3 )


        ******Limonlu cay ornegi****

          Cay   ve    Limon
        +     &&     +  ==> True;
        +     &&     -  ==> False;
        -     &&     +  ==> False;
        -     &&     -  ==> False;


        Cay   ve    Limon
        +     ||     +  ==> True;
        +     ||     -  ==> True;
        -     ||     +  ==> True;
        -     ||     -  ==> False;

         */

        System.out.println(5+2 == 8); //false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println("sonuc1 = " + sonuc1);// true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 != 7;
        System.out.println("sonuc2 = " + sonuc2);// false

        int sayi1 = 15;
        System.out.println(10 < sayi1 || sayi1<20);// true


        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);//true

        short a = 1000;
        System.out.println(a<15000 || a>28000 || a<-23); //true
        System.out.println(a<=1000 && a==1000 && a<12);//false





    }
}
