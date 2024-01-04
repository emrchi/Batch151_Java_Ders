package b151practices.lambda_02;


import java.util.*;

public class Lambda_Recap {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        pozKupBirleBas5(sayi);






    }



    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın






    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın





    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozKupBirleBas5(List<Integer> sayi){

        sayi.stream().filter(t -> t>0).map(t -> t*t*t).filter(t -> t%10==5).forEach(t-> System.out.println(sayi));
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın




}
