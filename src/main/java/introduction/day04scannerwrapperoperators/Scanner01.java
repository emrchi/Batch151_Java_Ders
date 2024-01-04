package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    //kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
    //rakamlarin toplamini yazdiran kodu yaziniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");
        int number = input.nextInt();
        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalanini almaliyiz.
        //% ==>modulus operator: solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        // dolayisi ile %10 her zaman bize birler basamagin da bulunan sayiyi verir.
        // bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle bir tam sayi yapar
        // yuvarlama yapmaz ondalikli kismi iptal eder
        //dolayisi ile bir tam sayiyi ona bolersek birler basamagini silmis oluruz.


        //son rakami al
        int lastDigit = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int lastSeconddigit = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan ucuncu rakami al
        int lastThirtdigit = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan 4. rakami al
        int lastFourthdigit = number % 10;
        //sayi kucult
        number = number / 10;

        //sondan besinci rakami al
        int lastFifthdigit = number % 10;
        int cevap = (lastFifthdigit + lastFourthdigit + lastSeconddigit + lastDigit);
        System.out.println("cevap = " + cevap);


    }

}
