package emre;

import java.util.Scanner;

public class odev {
      public static void main(String[] args) {

        byte studentAge = 44;
        System.out.println("studentAge = " + studentAge);
        char piSembol = '*';
        System.out.println("piSembol = " + piSembol);
        float pi = 3.14f;
        System.out.println("pi = " + pi);

        String isim = "Mehmet", soyisim= "Bulutluoz";
        System.out.println("isminiz = " + isim);
        System.out.println("soyisminiz = " + soyisim);

        int num1 = 5;
        int num2 = 888;
        System.out.println("Toplam = " + (num1 + num2));



        char isminizinBasharfi = 'E';
        System.out.println("isminizinBasharfi = " + isminizinBasharfi);

        int number= 78;
        char dogum= 'D';
        System.out.println(number + dogum);

        int sayi1=10, sayi2=20;
        int sayi3= sayi1;
        sayi1 = sayi2;
        sayi2 = sayi3;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);





    }


  public static class Calisma {

      public static void main(String[] args) {

          //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yazin.

          Scanner input = new Scanner(System.in);
          System.out.println("lutfen ilk sayiyi giriniz...");
          int ilksayi = input.nextInt();
          System.out.println("lutfen ikinci sayiyi giriniz...");
          int ikinciSayi = input.nextInt();

          System.out.println("Toplami : " + (ilksayi+ikinciSayi));
          System.out.println("Farki : " + (ilksayi-ikinciSayi));
          System.out.println("Carpimi: " + (ilksayi*ikinciSayi));
          System.out.println("Bolumu : " + (ilksayi/ikinciSayi));

          //kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
          //rakamlarin toplamini yazdiran kodu yaziniz.

          System.out.println("lutfen bes basamakli bir sayi giriniz...");
          int num = input.nextInt();
          int num1 =num/10000;
          int num2 = (num/1000)%10;
          int num3 = (num%100)/10;
          int num4 = num%10;
          System.out.println(num1+num2+num3+num4);


      }





  }
}
