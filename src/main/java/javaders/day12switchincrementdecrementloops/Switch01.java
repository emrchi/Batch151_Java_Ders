package javaders.day12switchincrementdecrementloops;

public class Switch01 {

    public static void main(String[] args) {

        //1.Ay numarasi verildiginde ayin ismini konsola yazdiran kodu yaziniz.
        //2.Ay numarasi verildiginde numarasi verilen ayin ismini ve December'a kadar ki tum aylarin isimlerini konsola yazdiran kodu yaziniz.
        //2. soru icin birinci soruyu cevapladigimiz koddaki breakleri December case ine kadar kaldirdik.

        /*
        Note: switch parantezi icinde String, int, byte, shorth ve char kullanabilinir.
              boolean, float double, long kullanilamaz.
         */

        int monthNumber = 3;

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                //break;
            case 2:
                System.out.println("February");
                //break;
            case 3:
                System.out.println("March");
                //break;
            case 4:
                System.out.println("April");
                //break;
            case 5:
                System.out.println("May");
                //break;
            case 6:
                System.out.println("June");
                //break;
            case 7:
                System.out.println("July");
                //break;
            case 8:
                System.out.println("August");
                //break;
            case 9:
                System.out.println("September");
                //break;
            case 10:
                System.out.println("October");
                //break;
            case 11:
                System.out.println("November");
                //break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }






    }
}
