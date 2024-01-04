package b151practices.day_15practice;

public class Memur extends Muhasebe {

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    //to String methodu objelerin tum ozelliklerini yazdirmak icin pratik bir yontemdir.

    public static void main(String[] args) {

        Memur memur1 =new Memur();

    /*
    memur1 objesi memur class'inin objesi olmasina ragmen Inherit ettigi Muhasebe ve onun'da Parent'i olan Personel class'larindaki tum datalari alabilir.
     */

        memur1.persNo = 1001;
        memur1.isim ="Ahmet";
        memur1.soyIsim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="3124568985";

        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas=memur1.maasHesapla();

        System.out.println(memur1.persNo);//1001
        System.out.println(memur1.maas);//2400

        System.out.println(memur1.toString()); //Memur{saatUcreti=10, statu='Memur', maas=2400, persNo=1001, isim='Ahmet', soyIsim='Tepe', adres='Ankara', tel='3124568985'}


        Memur memur2 = new Memur();

        memur2.persNo = 1002;
        memur2.saatUcreti = 10;
        memur2.maas = memur2.maasHesapla();

        System.out.println(memur2.toString()); //Memur{saatUcreti=10, statu='null', maas=2400, persNo=1002, isim='null', soyIsim='null', adres='adres girilmedi', tel='tel girilmedi'}

        //artik bu fabrika da istedigimiz kadar memur uretebiliriz.
        //urettigimiz her memur muhasebe class'indaki ve personel class'indaki tum ozellikleri Inherit etmis olur.




    }



}
