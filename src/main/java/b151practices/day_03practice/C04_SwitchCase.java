package b151practices.day_03practice;

import java.util.Scanner;

public class C04_SwitchCase {

         /*

        Bir restoranda, müşteriler menüden yemeklerini seçerler.
        Restoran, müşterilerin seçtiği yemeği pişirmek için bir
        program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
        secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
        belirlendigi bir program yaziniz.
        hamburger 200 TL  pizza 500 TL tavuk700 TL

        */

    public static void main(String[] args) {

        String yemek ="Hamburger";

        switch (yemek) {
            case "Hamburger":
                System.out.println("Hamburger Menusu 200 TL");
                break;
            case "Pizza":
                System.out.println("Pizza Menusu 500 TL");
                break;
            case "Tavuk":
                System.out.println("Tavuk Menusu 700 TL");
            default:
                System.out.println("Oyle Bir Secenegimiz Yok.");
        }

        /*
        Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralama ucreti ve kiralanacak gun sayisina gore
        toplam odenecek fiyati gosteren kodu yaziniz.
        SUV ==>500.0
        SEDAN ==> 400.0
        HATCBACK ==> 350.0
        geriye kalanlar ==>300.0 TL
        */

        String aracTuru = "SUV";
        int gun = 5;
        double kiralamaUcreti = 0;

        switch (aracTuru) {
            case "SUV":
                kiralamaUcreti = 500.0;
                break;
            case "SEDAN":
                kiralamaUcreti = 400.0;
                break;
            case "HATCBACK":
                kiralamaUcreti = 350.0;
                break;


        }
        System.out.println("Toplam ucret = " + (gun*kiralamaUcreti));// Toplam ucret = 2500.0


        /*
        Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
        gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
        istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
        onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
        kontrol eden bir program yaziniz
        elephant, lion, giraffe default ==> belirtilen hayvan bulunamadi
        */






    }

}
