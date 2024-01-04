package b151practices.Practice1;

public class C03Ascii {

    public static void main(String[] args) {

        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
        /*
         A ==> 65
         B ==> 66
         C ==> 67   C==> B+1 = 66+1
         D ==> 68
         E ==> 69   E ==> D+1 = 68+1
         F ==> 70

         L ==> 76
         M ==> 77   M ==> L+1 = 76+1
         */
        char ilkKarakter = 'B' + 1;
        char ikinciKarakter = 'D'+ 1;
        char ucuncuKarakter = 'L' + 1;
        System.out.println("" + ilkKarakter+ikinciKarakter+ucuncuKarakter);



    }


}
