package b151practices.Practice1;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        //bir okul ismi donduren method olusturun
        //o okulun o yil ak



    }
    public static void okulIsmiyazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir okul ismi giriniz");
        String okulIsmi = scan.nextLine();
        System.out.println(okulIsmi);
    }
    public static void isAktiveMi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen girdiginiz okul tarihinde aktif ise true degil ise false giriniz.");
        boolean isActive = scan.nextBoolean();
        System.out.println(isActive);
    }
}
