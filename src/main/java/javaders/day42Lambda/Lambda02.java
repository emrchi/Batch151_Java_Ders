package javaders.day42Lambda;

import javaders.day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7,10)); //34
        System.out.println(getMultpilyInTheGivenRange(7,10)); //5040
        System.out.println(getSumOfDigitsInTheGivenRange(45,47)); //30

    }
    //Swap icin bir tane private method :
    //asagida ki examplelarda methodun parantez ici parametreleri (10,7) gibi oldugunda onu swap yapmak icin
    private static List<Integer> swap(int starting, int ending){

        List<Integer> list = new ArrayList<Integer>();

        if(starting>ending){
            starting = starting+ending;
            ending =starting-ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;

    }

    //Ex 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending){

        swap(starting,ending);
        return IntStream.rangeClosed(starting, ending).sum();

    }
    //Ex 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int getMultpilyInTheGivenRange(int starting, int ending){

        swap(starting, ending);
        return IntStream.rangeClosed(starting, ending).reduce(Math ::multiplyExact).getAsInt();
    }

    //Ex 2: 45'den 47'e kadar tamsayilarin rakamlari toplamini  hesaplayan method'u olusturunuz.
    //      45 46 47 ==> 4+5+4+6+4+7 =30

    public static int getSumOfDigitsInTheGivenRange (int starting, int ending){

        swap(starting,ending);
        return IntStream.rangeClosed(starting,ending).map(Utils ::getSumOfDigits).sum();
    }

}
