package daytimejavaders.day16arraysforeachloop;

import java.util.Arrays;

public class Array03 {

    public static void main(String[] args) {

        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        //1. Way

        String[] names = {"K","C","R","A","S"};

        String eleman = "U";

        int count = 0;

        for(String w: names) {
            if(eleman.equals("U")) {
                count++;
                break;
            }

        }
        if(count > 0) {
            System.out.println("Array has ==>" + eleman);

        }else{
            System.out.println("Array does not have ==>" + eleman);
        }

        //2.Way
        //Javanin array icindeki spesifik bir elemenani olup olmadigini bulmak icin yaptigi method
        //Arrays.binarySearch(icinde aramak yapilacak array ismi , arrayde aranacak eleman   )

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,"U");
        if(result>0){
            System.out.println("Array has ==>" + eleman);

        }else {
            System.out.println("Array does not have ==>" + eleman);
        }





    }
}
