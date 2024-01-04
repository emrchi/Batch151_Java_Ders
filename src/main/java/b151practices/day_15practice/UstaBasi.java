package b151practices.day_15practice;

public class UstaBasi extends Isci{

    @Override
    public String toString() {
        return "UstaBasi{" +
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

        UstaBasi ustabasi1 = new UstaBasi();

        ustabasi1.isim = "Murat"; //personal
        ustabasi1.soyIsim = "Gokmen"; //personal
        ustabasi1.saatUcreti = 15; //Muhasebe
        ustabasi1.maas= ustabasi1.maasHesapla(); //Muhasebe
        ustabasi1.statu = "Isci"; //Muhasebe
        ustabasi1.isciStatu = "Ustabasi"; //Isci

        ustabasi1.mesai(); //Isci clasinda ki methodu cagirdik ==>  Isciler gunluk 8 saat ve hafta da 5 gun calisir

        System.out.println(ustabasi1.toString());// UstaBasi{isciStatu='Ustabasi', saatUcreti=15, statu='Isci', maas=3600, persNo=0, isim='Murat', soyIsim='Gokmen', adres='adres girilmedi', tel='tel girilmedi'}





    }
}
