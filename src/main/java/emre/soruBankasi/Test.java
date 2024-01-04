package emre.soruBankasi;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //    Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(31);
        nums.add(7);
        nums.add(13);
        nums.add(10);

        nums.replaceAll((x -> x == 7 || x == 10 ? x : x + 2));
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i)!= 7 && nums.get(i)!= 10){
                nums.set(i, nums.get(i)+2);
            }
        }
        System.out.println(nums);

     }



}







