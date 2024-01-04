package b151practices.day_06practies;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

     /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1-4 arası islem numaranizi giriniz" + "\n" +
                "işlem 1: Bakiye Sorgulama" + "\n" +
                "işlem 2: Para Cekme" + "\n" +
                "işlem 3: Para Yatırma" +"\n" +
                "işlem 4: İşlemi Sonlandırın");
        int islemNo = input.nextInt();

        int bakiye = 10000;

        switch (islemNo) {
            case 1:
                System.out.println("Bakiyeniz: " + bakiye);
                case 2:
                    System.out.println("Lutfen cekmek istediginiz tutari giriniz ");
                    int cekilecekTutar = input.nextInt();
                    if(cekilecekTutar>2000){
                        System.out.println("Gunluk cekilebilecek maksimum tutar 2000 Tl'dir ");
                    }else{
                        bakiye = bakiye - cekilecekTutar;
                        System.out.println("Bakiyeniz: " + bakiye + "Tl'dir ");
                    }
            case 3:
                System.out.println("Lutfen yatirmak istediginiz tutari giriniz ");

        }





    }
}
