package javaders.day12switchincrementdecrementloops;

public class Loops01 {

    /*
    Ekrana 5 kere "Hi" yazdiriniz.
     */

    public static void main(String[] args) {

        /*
        Code yazarken i) Tekrarli code yazmamaya dikkat ederiz.
                      ii)Yazdiginiz code'un gerektiginde tamir edilebilmesinin kolay olmasina.
                      iii)Yazdiginiz code'un gerektiginde gelistirilebilmesinin kolay olmasina.
                      iv)Yazdiginiz code'un farkli senaryolar icin de calisabilmesine dikkat ediniz.
                        Clean code
         */


        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        // Bu sekilde yapmak uygun degildir. Usele aykiridir.
        // Cunku tekrar yazilimda sevilmez. Update etmek zordur. mesela 5000 kere isterse tekrar edilmez.
        // kodun gelistirme asamasi icin tavsiye edilmez.
        // Bu nedenle yukaridaki gibi tekrar gerektiren isler icin "Loop" yapilari kullanilir.
        // 4 tane loop yapisi vardir. i) for-loop ii) while-loop iii) do-while-loop iv) for-each-loop

        //***********for-loop***********
        // for(   Starting Value    ;    Loop Condition    ;   Increment/Decrement   ){}
        //        baslangic degeri        Durma degeri yap     arttirma azaltma
        // butun luplar icin gecerli taslak.
        for (int i = 1; i < 6; i++) {
            System.out.println("hi");
        }


        //4'den 24'e kadar tum tam sayilari ayni satirda aralarina bosluk birakarak consola yazdiriniz.

        for (int i = 4; i < 25; i++) {
            System.out.print(i + " "); //4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
        }

        System.out.println();
        //33'den 11'e kadar tum cift tamsayilari ayni satirda, aralarina bosluk birakarak consola yazdiriniz.

        for (int i = 33; i > 10; i--) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

        //yada
        System.out.println();

        for (int i = 32; i > 10; i -= 2) {

            System.out.print(i + " "); // bu tavsiye ve tercih edilmez...
        }

        //20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak consola yazdiriniz.

        System.out.println();
        for (int i = 20; i < 75; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");
            }
        }

        //Massachusetts kelimesindeki tum sesli harfleri console'a yazdiriniz.

        System.out.println();

        String s = "Massachusetts";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
                System.out.print(c + " ");
            }
        }




    }


}



