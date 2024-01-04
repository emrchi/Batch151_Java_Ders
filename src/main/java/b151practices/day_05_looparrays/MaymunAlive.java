package b151practices.day_05_looparrays;

public class MaymunAlive {

    /*
    INTERWIEW SORUSU

    Adada yanliz bir maymun var
    Hergun 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

     */

    public static void main(String[] args) {

        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("Bugun " + survivalDays + ". gun Maymun halen yasiyor");

        do {
            numberOfBananas-=4; //toplam muz sayisindan hergun 4 muz eksilir
            System.out.println("Kalan Muz Sayisi: "+ numberOfBananas);
            survivalDays++;
            if(numberOfBananas<4){
                monkeyAlive = false;
                System.out.println("Bugun " + survivalDays + ". gun yeterli muz kalmadi Maymun rahmetli basiniz sagolsun" );
            }else{
                System.out.println("Bugun " + survivalDays + ". gun Maymun halen yasiyor");
            }
        }while (monkeyAlive);

        // bunu farkli yollardanda coz olurmu

    }
}
