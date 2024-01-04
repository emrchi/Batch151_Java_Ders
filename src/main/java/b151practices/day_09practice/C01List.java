package b151practices.day_09practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class C01List {

    /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

    public static void main(String[] args) {




    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>10){
                numbers.set(i,numbers.get(i)*2);
            }
        }
        System.out.println(numbers);

    }
}
