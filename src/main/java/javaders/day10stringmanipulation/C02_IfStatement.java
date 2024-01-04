package javaders.day10stringmanipulation;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        // Kullanici gun numarasini girsin. Kod gun ismini yazsin.
        // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
        // 5== Persembe  6 == Cuma  7 == Cumartesi

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen gun numarasini asagidaki kriterlere gore giriniz n\" +\n" +
                "                \"1 ==> Pazar 2 ==>Pazartesi  \" +\n" +
                "                \"3 ==>Sali  4==>Carsamba\\n\" +\n" +
                "                \"5==> Persembe  6 ==>Cuma \" +\n" +
                "                \" 7 ==>Cumartesi");
        byte gun = input.nextByte();
        if(gun ==1){
            System.out.println("Pazar");
        } else if (gun == 2) {
            System.out.println("Pazartesi");
        } else if (gun == 3) {
            System.out.println("Sali");
        } else if (gun == 4) {
        System.out.println("Carsamba" );
        } else if (gun == 5) {
        System.out.println("Persembe");
        } else if (gun == 6) {
            System.out.println("Cuma");
        } else if (gun == 7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("lutfen gecerli bir rakam giriniz");
        }
    }
}
