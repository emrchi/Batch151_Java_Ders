package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {

             //******************* NestedIf ******************


    /* "If" icin de "If" kullanirsaniz, "NestedIf"olusturmussunuz demektir.
    Nested yapilar cok zaman harcarlar javayi yavaslatirlar o nedenle
    cok kullanilmasi tavsiye edilmez ama bazen mecbur kullanmak zorundayiz.
    "NestedIf" gibi Java'yi yavaslatan kodlar "Time Consuming" olarak adlandirilir
     */

    //Example
    //Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
    //Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
    //Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your age...");
        int age = input.nextInt();
        System.out.println("Please Enter your gender...");
        String gender = input.next();
        if(age<0 || age>120) {

            System.out.println("Negative ages or ages greaterthan 120 are invalid");

        }else if (gender.equalsIgnoreCase("male")) { //equalsIgnoreCase() icin male=Male=MALE=mALE.... dir

            if (age>65){
                System.out.println("Can be retired ");
            }else {
                System.out.println("Should work");
            }

        }else if (gender.equalsIgnoreCase("female")) {
            if (age>60){
                System.out.println("Can be retired ");
            }else {
                System.out.println("Should work");
            }

        }else {
                System.out.println("Undifined gender...");

            }
        }


    }

