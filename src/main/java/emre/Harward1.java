package emre;

import java.util.Scanner;

public class Harward1 {
    //if conditional

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz...");
        double mass = input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz...");
        double height = input.nextDouble();
        double bmi = mass / (height * height);
        System.out.println("bmi = " + bmi);

        String Category = null;

        if (bmi < 18.5) {
            Category = "Lowerweight";}
        if (bmi>=18.5 && bmi<25) {
            Category = "Normalweight";}
        if (bmi>=25 && bmi<30) {
            Category = "Overweight";}
        if (bmi>=30) {
            Category = "Obese";}

        System.out.println("Kullanicinin Category'si = " + Category);

        }

    }

