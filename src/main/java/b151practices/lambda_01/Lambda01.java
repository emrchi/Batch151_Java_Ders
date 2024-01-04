package b151practices.lambda_01;

import b151practices.day_15practice.UstaBasi;
import javaders.day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elemanlariYazdir1(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElemanlariYazdir1(nums);
        System.out.println();
        ciftElemanlariYazdir2(nums);
        System.out.println();
        tekSayilarinKareleriniAl1(nums);
        System.out.println();
        tekSayilarinKareleriniAl2(nums);
        System.out.println();
        tekSayilarinKupleriniTekrarsizAl1(nums);
        System.out.println();
        ciftElemanlarinKarelerininToplaminiAl(nums);
        System.out.println(ciftElemanlarinKarelerininToplaminiAl(nums));
        System.out.println(ciftElemanlarinKarelerininCarpiminiAl(nums));
        System.out.println(getMaxEleman1(nums));
        System.out.println(getMaxEleman2(nums));
        System.out.println(getMinEleman(nums));




    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void elemanlariYazdir1(List<Integer> nums){
        for (Integer w : nums){
            System.out.print(w + " "); //12 9 131 14 9 10 4 12 15
        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void elemanlariYazdir2(List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t + " ")); //12 9 131 14 9 10 4 12 15
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ciftElemanlariYazdir1(List<Integer> nums){
        for (Integer w: nums){
            if(w%2==0){
                System.out.print(w + " "); //12 14 10 4 12
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void ciftElemanlariYazdir2(List<Integer> nums){
        nums.stream().filter(t -> t%2==0).forEach(t -> System.out.print(t + " ")); //12 14 10 4 12
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void tekSayilarinKareleriniAl1(List<Integer> nums){
        for (Integer w: nums){
            if(w%2!=0){
                System.out.print(w*w + " "); //81 17161 81 225
            }
        }
    }

    //Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayilarinKareleriniAl2(List<Integer> nums){
        nums.stream().filter(t -> t%2 !=0).map(t-> t*t).forEach(t -> System.out.print(t + " ")); //81 17161 81 225
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayilarinKupleriniTekrarsizAl1(List<Integer> nums){
        nums.stream().distinct().filter(t -> t%2 !=0).map(t -> t*t*t).forEach(t -> System.out.print(t + " ")); //729 2248091 3375

    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

    public static int ciftElemanlarinKarelerininToplaminiAl(List<Integer> nums){
        return nums.stream().distinct().filter(t->t%2 ==0).map(t -> t*t).reduce(Math :: addExact).get(); //456
    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static int ciftElemanlarinKarelerininCarpiminiAl(List<Integer> nums){
        return nums.stream().distinct().filter(t-> t%2 == 0).map(t-> t*t).reduce(Math ::multiplyExact).get(); // 45158400
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz

    public static int getMaxEleman1(List<Integer> nums){
        //1.yol:
        return nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u); //131 Burada iternary kullandik
        // ondan dolayi bir baslangic degeri girmemiz gerekiyordu, onun icin Integer.MinValu aldik
    }
        //2.yol:
    public static int getMaxEleman2(List<Integer> nums){
        return nums.stream().distinct().reduce(nums.get(0) ,(t,u) -> t>u ? t : u); // 131
    }

        //3.yol:
    public static int getMaxEleman3(List<Integer> nums) {
            Integer max = nums.stream().distinct().sorted().reduce((t,u)-> u).get(); //131 Burada sorted methodu ile
            // siraladigimiz icin son elemani almamiz yeterliydi. onun icin reduce methodu (t,u)-> u ile iki elemani al
            // ikincisini tut seklinde son elemana kadar gidiyor.
            return max;
    }

    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static int getMinEleman (List<Integer> nums) {
        return nums.stream().distinct().reduce((t,u)->t<u ? t : u).get(); //4

    }





}
