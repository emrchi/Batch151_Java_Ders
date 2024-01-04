package b151practices.day_17practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {

    // Bir tane txt dosyası olusturunuz.
    // txt dosyasının icerisine cumleler yazınız
    // Olusturdugunuz txt dosyasına ulasınız.
    // icerisindeki cumleleri yazdırınız


    /*
    Bir kod yazilirken olasi exeption'lari on gorup exceptoion olustugunda Java'nin ne yapmasini
    istedigimize karar vermeliyiz.

    1--Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak main method isminin
     yanina olusabilecek exception'i deklere ederiz.
    2--Eger exception olustugunda kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu
    try blogunun icine yazmaliyiz.
     */


    public static void main(String[] args) {

        String dosyaYolu = "src/main/java/b151practices/day_17practice/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            int k = 0;
            while((k = fis.read()) != -1) {
                System.out.print((char)k);
            }

       // } catch (FileNotFoundException e) {
           // e.printStackTrace();
           // System.out.println("Yoluma devam ediyorum");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
