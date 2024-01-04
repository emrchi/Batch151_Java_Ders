package b151practices.day_06practies;

import java.util.Scanner;

public class C04_For_Agac {

    public static void main(String[] args) {


         /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen agac icin yaprak satir sayisini giriniz...");
        int yaprakSayi = input.nextInt();
        System.out.println("Lutfen agac icin govde satir sayisinicgiriniz...");
        int govdeSayi = input.nextInt();

        String yaprak = "";
        for(int i = 0 ; i<yaprakSayi ; i++){
            yaprak = yaprak + "^";
            System.out.println(yaprak);
            }
        for (int j = 0 ; j<govdeSayi ; j++){
            System.out.println("|||");

        }



    }

}
