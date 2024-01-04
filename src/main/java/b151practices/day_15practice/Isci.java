package b151practices.day_15practice;

public class Isci extends Muhasebe{

    protected String isciStatu = "Surekli Isci"; //surekli isci class'de ve usta basi class'da isci statusune herhangi
                                                 // bir atama yapmaz iseniz statu ye bu default degerini ata diyorum.

    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve hafta da 5 gun calisir");
    }

    //bu class'danda obje olusturabiliriz.
    //bu class'in child class'larinin olmasi obje olusturmaya engel degildir. fakat isciler icin,
    // surekli isci ve ustabasi olmaktan  baska ihtimal olmadıgı icin isci class'ında isci uretmeye gerek yok


}
