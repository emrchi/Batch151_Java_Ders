package emre;

import java.util.Scanner;

public class Tekrar_1 {

    public static void main(String[] args) {

        //Example
        //Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        //Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
        //Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Kadin icin K erkek icin E seklinde giriniz.");
        String cinsiyet = input.next();
        System.out.println("Lutfen yasinizi o'dan buyuk 120'den kucuk olacak sekilde giriniz.");
        int yas = input.nextInt();

        if(cinsiyet.equals("K")){
            if(yas>60){
                System.out.println("Emekli Olabilir ");
            }else {
                System.out.println("Emekli Olamaz ");
            }

        }else{
            if(yas>65){
                System.out.println("Emekli Olabilir ");
            }else{
                System.out.println("Emekli Olamaz ");
            }
        }

        /*
    Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz.
     */

        System.out.println("Please enter two integers...");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //1.Way

        if(num1<num2){System.out.println(num1);}else{System.out.println(num2);}

        //2.Way Used Ternary

        int result = num1<num2 ? num1 : num2;
        System.out.println(result);


        /*
    Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yzadirin, degilse
    "Pozitif degil" yazdirin.
    */
        System.out.println("Please enter a integer");
        int num = input.nextInt();

        String sonuc = num>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(sonuc);


        /*
     Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
    1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
    2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
     */
        //1. Way

        System.out.println("please enter a year");
        int year = input.nextInt();
        String yil = year%100==0 ? year%400==0 ? "Year is Leap" :"Year is not leap" : year%4==0 ? "Year is Leap" : "Year is not leap";
        System.out.println(yil);

        //2. Way
        if(year%100==0){
            if(year%400==0){
                System.out.println("Year is Leap");
            }else{
                System.out.println("Year is not leap");
            }

        }else{
            if(year%4==0){
                System.out.println("Year is Leap");
            }else{
                System.out.println("Year is not leap");
            }
        }

        /*
    Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz.
    tek ise "Bu sayi ikiye bolunmez" yazdiriniz.
     */

        System.out.println("Lutfen bir sayi giriniz...");
        int sayi = input.nextInt();

        Object result2 = sayi%2==0 ? sayi/2 :"Bu sayi ikiye bolunmez";
        System.out.println(result2);


        /*
    Kullanicidan gun isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz.
    Sunday ==>1 Monday ==>2 Tuesday ==>3 Wednesday ==>4 Thursday ==>5 Friday ==>6 Saturday ==>7
     */


        System.out.println("Please enter a name of day..");
        String day = input.next();

        switch (day.toLowerCase()){
            case "sunday" : System.out.println("Sunday is the first day");
            break;
            case "monday" : System.out.println("Sunday is the second day");
            break;
            case "tuesday" : System.out.println("Tuesday is the third day");
            break;
            case "wendesday" : System.out.println("Wendesday is the fourth day");
            break;
            case "thursday" : System.out.println("Thursday is the fifth day");
            break;
            case "friday" : System.out.println("Friday is the sixth day");
            break;
            case "saturday" : System.out.println("Saturday is the seventh day");
            break;
            default:
                System.out.println("Invalid day name");
        }





    }

}
