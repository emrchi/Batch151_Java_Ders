package javaders.day41Lambda;

import java.util.ArrayList;
import java.util.List;

public class lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums)); //436
        System.out.println(getTheSumOfSquareOfOdds2(nums)); //436

        System.out.println(getTheMultplyOfSquareOfEvens1(nums)); //147456
        System.out.println(getTheMultplyOfSquareOfEvens2(nums)); //147456

        System.out.println(getTheSumOfMaxOfEvensAndMinOfOdds1(nums)); //15
        System.out.println(getTheSumOfMaxOfEvensAndMinOfOdds2(nums)); //15

        System.out.println(getSumOfMaxSmlThenSevenAndMinBigThenEight1(nums)); //15
        System.out.println(getSumOfMaxSmlThenSevenAndMinBigThenEight2(nums)); //15



    }

    //ex1: verilen bir list'deki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
      //Lambda Expresiton ile cozum
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums) {
        return nums.
                stream().
                filter(t-> t%2!=0).
                map(t-> t*t).
                reduce(0, (t,u)->t+u); //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin
                                              // ilk degerini daha sonraki tum degerleri toplamdan alir, "u" ise stream'den alir
                                              //reduce() => deger sayisini azaltmak. Coklu datayi tekli dataya
                                              // cevirmek istedigimizde bu method kullanilir
    }
         //Method reference  ile cozum:
    public static int getTheSumOfSquareOfOdds2(List<Integer> nums) {
        return nums.
                stream().
                filter(Utils ::isOdd).
                map(Utils ::getSquare). //Ihtiyaciniz olan method Java Class'larinda yoksa Utils Class
                                        // olusturup icinde ihtiyaciniz olan ihtiyacimiz olan method'u olusturunuz ve method reference kullaniniz
                reduce( Math ::addExact) //class Ismi :: Method ismi ==> Method reference
                .get(); //get() method'u Optional<Integer> i Integer'a cevirir
    }


        /*
        Lambda expression'lari kaldirmamiz gerekir. Math: : yazdigimizda Math class'i icindeki methodlari goruruz.
        Bize toplama islemi lazim oldugu icin buradan add methodunu aldik. Math: : addExact
        Bu syntax'e method reference denir. Method'a bir atifta bulunduk. Boylece java bu methoda gore islem yapti.
        reduce methodu icinde  (0, (t,u)->t+u) yazmak yerine, (Math: :addExact) yazdik.
        O kisim kizarinca, yenina get methodu ekleyince duzeldi.
        Baska bir kodumuzda sayinin karesini almamiz gerekmisti. Math class'ina gittik ve sayilarin karesini
        alan bir method var mi diye baktik ve bulamadik. Applicationimizda kare alma sikca kullanilacak bir islem ise
        onun  icin package kismina gelip Utils Class isimli class'i olusturmaliyiz. Utils demek sik kullanilanlardir
        ve faydali methodlarin depolandigi yer demektir. Bir kere bu class'i olusturup lazim olan methodu bir kere
        olusturup, buraya depolariz ki daha sonra kullanabilelim.
        Utils class'i icinde public static int getSquare(int a){
        return a*a;
        }
        Daha sonra kodumuz icinde bu methodu kullanmak icin map methoud icinde Utils: :getSquare)
        yazarak Utils classimizda depoladigimiz methodu alip kullanabildik.
         */


    //Ex2: verilen bir list'deki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz
     //Lambda Expresiton ile cozum
    public static int getTheMultplyOfSquareOfEvens1(List<Integer> nums){
        return nums.
                stream().
                filter(t -> t%2==0).
                map(t-> t*t).
                distinct().
                reduce(1,(t,u)->t*u);

    }
        //Method reference  ile cozum:
    public static int getTheMultplyOfSquareOfEvens2(List<Integer> nums){
        return nums.
                stream().
                filter(Utils ::isEven).
                map(Utils ::getSquare).
                distinct().
                reduce(Math ::multiplyExact).
                get();

    }

    //Ex3: verilen bir list cift sayi olan elemanlarin max. degeri ile
    // tek sayi olan elemanlarin min. degerinin toplamini hesaplayan methodu olusturunuz.
     //Lambda Expresiton ile cozum
    public static int getTheSumOfMaxOfEvensAndMinOfOdds1(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(t -> t%2==0).reduce((t,u)->t>u ? t:u).get();
        int minOdds = nums.stream().distinct().filter(t -> t%2!=0).reduce((t,u)->t<u ? t:u).get();
        return maxEven + minOdds;

        //reduce() methodunu etkisiz eleman kullanmadan kullanirsak data tipleri uyusmadigi icin hata verir(Optional Integer) verir.
        //Burada reduce() methodundan sonra get() methodunu kullanarak (Optional Integer) i Integer'a ceviriyoruz.
        //Bu kodu yazarken soruda tekrarsiz demedigi halde distinct() kullandik cunku max ve min bulmak icin tekrali elemanlara gerek yok.


    }
        //Method reference  ile cozum:
    public static int getTheSumOfMaxOfEvensAndMinOfOdds2(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(Utils ::isEven).reduce(Utils ::getMax).get();
        int minOdds = nums.stream().distinct().filter(Utils ::isOdd).reduce(Utils ::getMin).get();
        return maxEven + minOdds;
    }

    //Ex4:Verilen bir list'teki cift sayi olan elemanlarin 7'den kucuk maksimum degeri ile tek sayi olan elemanlarin
    // 8'den buyuk minimum degerinin toplamini hesaplayan method olusturunuz.
      //Lambda Expresiton ile cozum:

    public static int getSumOfMaxSmlThenSevenAndMinBigThenEight1(List<Integer> nums){

        int max = nums.stream().distinct().filter(t-> t%2==0 && t<7).reduce((t,u)-> t>u ? t:u).get();

        int min = nums.stream().distinct().filter(t-> t%2!=0 && t>8).reduce((t,u)-> t<u ? t:u).get();

        return max+min;
    }
       //Method reference  ile cozum:
    public static int getSumOfMaxSmlThenSevenAndMinBigThenEight2(List<Integer> nums){

        int max = nums.stream().distinct().filter(Utils ::isEvenSmallerThenSeven).reduce(Utils ::getMax).get();

        int min = nums.stream().distinct().filter(Utils ::isOddGraterThenEight).reduce(Utils ::getMin).get();

        return max+min;
    }


}
