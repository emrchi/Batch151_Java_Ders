package b151practices.Practice1;

import java.util.Scanner;

public class C05Scanner {

    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input = new Scanner(System.in);

        System.out.print("Adınızi giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int yas =input.nextInt();

        System.out.print("Boyunuzu giriniz: ");
        int boy = input.nextInt();

        System.out.print("Kilosunuzu giriniz: ");
        int kilo = input.nextInt();

        System.out.println("Adı: " + ad);
        System.out.println("Soyadi: " + soyad);
        System.out.println("Yaşı: " + yas);
        System.out.println("Boyu: " + boy);
        System.out.println("Kilosu: " + kilo);

        //Yada
        System.out.println("Adi: " + ad + "\n" + "Soyadi: " + soyad +"\n" + "Yaşı: " + yas + "\n" + "Boyu: " + boy + "\n" + "Kilosu: " + kilo);






    }



}
