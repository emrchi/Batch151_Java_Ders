package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        /*
        Ex1:Bir Integer List'deki birbirine en yakin iki elemani bulunuz.
        [12,23,10,19]==> 12 and 10
         */

        List<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(23);
        nums.add(14);
        nums.add(10);

        //Collections.sort(); method'u listede ki elementleri "natural order" yapar yani siralar
        Collections.sort(nums);
        System.out.println(nums); //[10, 13, 14, 23]

        int minDiff = nums.get(1)-nums.get(0);; // Sayilar arasindaki min difference i bulmak icin bir minDiff atamamiz gerekiyor
                                                // en kucuk farkin bu oldugunu farz ediyoruz. zaten loop ile minDiff degisecek.

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1)); // min methodu kendisine verilen iki sayidan kucugunu secer.
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1) + "and" + nums.get(i));
            }
        }
    }

}
