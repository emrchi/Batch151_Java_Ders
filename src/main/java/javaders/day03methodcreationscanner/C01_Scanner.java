package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {




        //1) object olusturma
        Scanner input = new Scanner(System.in); //Tolgahan

        //2) Kullaniciya ne yapacagini soyluyoruz

        System.out.println("Lutfen maasinizi giriniz");

        //3) Kullanicidan alinan datalar yapisina ve buyuklugune gore bir variable'a yerlestirilir.
        
        long maas = input.nextLong();
        //4) Kullanicinin verdigi bilgileri teyit edebilmesi icin v.s. yazdirilir


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("Lutfen cinsiyetinizi Kadin ise K erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);
        System.out.println("lutfen adinizi giriniz");
        input.nextLine(); // Dummy atmak... Satir atlamasi yapmasini engeller asagidaki objrctle beraber kullanilir.
        String isim = input.nextLine(); // nextline methodu tolga mete ali gibi birden fazla ismi yazmak icin. sadece next() metodu kullansaydik sadece tolgayi yazardi
        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("Lutfen ulkenizi sevip sevmediginizi True/False seklinde giriniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("*****Tolgahan*******");

        System.out.println("Maasiniz..."+"\nCinsiyetiniz..."+ cinsiyet+"\nAdiniz..." + isim+"\nMemleketiniz..."+memleket+"\nYasiniz..."
                +yas+ "\nBoyunuz..."+boy+ "\nUlkenizi seviyormusunuz..."+seviyorMu );


        
        
    }


    
}
