package b151practices.day_07practies;

import java.util.Scanner;

public class C02_DoWhile {

    public static void main(String[] args) {


          /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */


        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan Yuksekligi Giriniz...");
        double yukseklik = input.nextDouble();

        double toplamYol = 0;
        int vurmaSayisi = 0;

        int counter = 0;

        do {
           toplamYol+= yukseklik;
           vurmaSayisi++;
           toplamYol+=yukseklik*0.5;
           yukseklik=yukseklik/2;

        }while (yukseklik>=1);

        toplamYol+=yukseklik; // bu son iki kodu son ziplama da top hava da kaldigi icin son yuksekligi ekledik  ve son vurma yi arttirdik
        vurmaSayisi++;

        System.out.println("Yere Vurma sayisi: " + vurmaSayisi);
        System.out.println("Toplam Alinan Yol " + toplamYol);




    }

}
