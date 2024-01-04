package b151practices.day_17practice;

import java.util.Scanner;


public class C01_Exception {

    // Kullanıcıdan istedigi kadar sayiyi alıp toplayan bir program yazınız
    // toplam 500'u gecerse programı bitirsin veya
    // kullanıcı bitirmek istediginde Q'ya basmalıdır

    public static void main(String[] args) {

        toplama();

    }

   private static void toplama() {

       Scanner input = new Scanner(System.in);

       int toplam = 0;

       do{
           System.out.println("Lutfen Toplamak Istediginiz Sayiyi Giriniz,\nBitirmek icin Q'ya basiniz...");
           int sayi = 0;
           try {
               sayi = input.nextInt();
           } catch (Exception e) {
              String durdurma = input.next();
              if(durdurma.equalsIgnoreCase("q")){
                  break;
              }else{
                  System.out.println("Hatali giris");
              }
           }
           toplam = toplam+sayi;
       }while (toplam < 500);

       System.out.println("Toplam = " + toplam);

   }
}
