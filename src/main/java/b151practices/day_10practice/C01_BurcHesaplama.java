package b151practices.day_10practice;

import java.util.Scanner;

public class C01_BurcHesaplama {

    public static void main(String[] args) {

        // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi String giriniz...");
        String mounth = input.next();
        System.out.println("Lutfen dogdugunuz gunu Integer giriniz...");
        int day = input.nextInt();

        String burc = "";

        if(mounth.equalsIgnoreCase("Ocak")){
            if(day>22){
                burc = "Kova";
            }else{
                burc = "Oglak";
            }
        }if(mounth.equalsIgnoreCase("Subat")){
            if(day>20){
                burc = "Balik";
            }else{
                burc = "Kova";
            }
        }if(mounth.equalsIgnoreCase("Mart")){
            if(day>21){
                burc = "Koc";
            }else{
                burc = "Balik";
            }
        }if(mounth.equalsIgnoreCase("Nisan")){
            if(day>21){
                burc = "Boga";
            }else{
                burc = "Koc";
            }
        }if(mounth.equalsIgnoreCase("Mayis")){
            if(day>22){
                burc = "Ikizler";
            }else{
                burc = "Boga";
            }
        }if(mounth.equalsIgnoreCase("Haziran")){
            if(day>23){
                burc = "Yengec";
            }else{
                burc = "Ikizler";
            }
        }if(mounth.equalsIgnoreCase("Temmuz")){
            if(day>23){
                burc = "Aslan";
            }else{
                burc = "Yengec";
            }
        }if(mounth.equalsIgnoreCase("Agustos")){
            if(day>22){
                burc = "Basak";
            }else{
                burc = "Aslan";
            }
        }if(mounth.equalsIgnoreCase("Eylul")){
            if(day>23){
                burc = "Terazi";
            }else{
                burc = "Basak";
            }
        }if(mounth.equalsIgnoreCase("Ekim")){
            if(day>23){
                burc = "Akrep";
            }else{
                burc = "Terazi";
            }
        }if(mounth.equalsIgnoreCase("Kasim")){
            if(day>22){
                burc = "Yay";
            }else{
                burc = "Akrep";
            }
        }if(mounth.equalsIgnoreCase("Aralik")){
            if(day>22){
                burc = "Oglak";
            }else{
                burc = "Yay";
            }
        }
        System.out.println("Burcunuz: " +burc);



    }
}
