package b151practices.day_05_looparrays;

public class Butce {

    //Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
    //kullanildigi bir butce ile
    //kisisel harcamalarinin yapildigi
    //harcliklarin oldugu basit bir ev butcesi kodu yaziniz.


    public static int butce;
    public static int harclik;

    public void maasAl(int alinanMaas){
        butce+=alinanMaas; //butce = butce+alinanMaas;

    }
    public void harclikAl(int alinanHarclik){
        butce-=alinanHarclik; //ortak hesap butceden harclik alinir
        harclik+=alinanHarclik; //alinan harclik harclik konteynirina eklendi.

    }
    public  void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;  //butceden harcanacak ortak giderler mesela tv

    }
    public void harcliktanHarca (int harclikHarcamasi){
        harclik-=harclikHarcamasi;  // harcliktan harcanacak giderler mesela otobus bileti sigara felan.
    }



}
