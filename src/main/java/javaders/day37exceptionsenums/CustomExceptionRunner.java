package javaders.day37exceptionsenums;

import javaders.day37exceptionsenums.IllegalGradeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    /*
        1)try kullandiginizda her senaryo icin calismasini istedigimiz code'lari "finally block" icine koyariz
        2)"final" "finally" ve "finalize" aciklarmisiniz ?
          "final" islendi
          "finally" islendi
          "finalize" ==> GarbageCollector memory'i temiz tutmak icin surekli memory'i tarar ve silinmesi gerekenleri siler.
                         GarbageCollector silmeden once silecegi data'lari "finalize" eder sonra siler.
 */

    public static void main(String[] args) throws IllegalGradeException {

        try {
            pintAge(-24);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I always work");
        }

        System.out.println(getGrades());


    }
    //Ex1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz.

    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        String grade;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade... To stop entering press q ");
            grade = input.next();

            int intGrade = 0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }
            if(grade.equals("q")){
                break;
            }else if(intGrade>=0 && intGrade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and grater than 100 are not valid.");
            }


        }while(!grade.equals("q"));

        return grades;

    }

    //Ex2: Kullanicinin yasini consol'a yazdiran method'u olusturunuz.

    public static void pintAge(int age){
        if(age<0){
            throw new IllegalAgeException("Ages cannot be negative");
        }
        System.out.println(age);
    }

}
