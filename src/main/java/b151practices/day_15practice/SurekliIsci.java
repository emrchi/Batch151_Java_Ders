package b151practices.day_15practice;

public class SurekliIsci extends Isci {

    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SurekliIsci surIc1 = new SurekliIsci();

        surIc1.persNo = 5001; //personel class'indan cagirdik
        surIc1.isim = "Cem";  //personel class'indan cagirdik
        surIc1.soyIsim = "Oz";   //personel class'indan cagirdik
        surIc1.statu = "Isci"; //Muhasebe class'indan cagirdik
        surIc1.saatUcreti = 11; //Muhasebe class'indan cagirdik
        surIc1.maas = surIc1.maasHesapla(); //Muhasebe class'indan cagirdik

        System.out.println(surIc1.persNo); //5001


        System.out.println(surIc1.toString()); //SurekliIsci{isciStatu='Surekli Isci', saatUcreti=11, statu='Isci', maas=2640, persNo=5001, isim='Cem', soyIsim='Oz', adres='adres girilmedi', tel='tel girilmedi'}





    }
}
