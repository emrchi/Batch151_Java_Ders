package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {

    //********************Nested For Loop**********************


    // ex: 4 hafta icin 1. hafta 7 gun 2 hafta 7 gun.... seklinde alt alta yazdirin
    /*
     1.Example:Type code to get the output like
            Week: 1
              Day: 1
              Day: 2
              Day: 3
              .....
            Week: 2
              Day: 1
              Day: 2
              Day: 3
              ....
            Week: 3
              Day: 1
              Day: 2
              Day: 3
              ....
     */

    public static void main(String[] args) {

        for(int i=1;i<5;i++) {
            System.out.println("Week: " + i);

            for(int k=1;k<8;k++) {
                System.out.println("   Day: " + k);

            }
        }

        //************************Nested while loop************************
        int i=1;
        while(i<3) {
            System.out.println("Week: " + i);
            int k=1;
            while (k<4){
                System.out.println("   Day: " + k);
                k++;
            }
            i++;
        }
        /*
        ex2: Write a Java program to Print Rectangle Star Pattern using For loops
            * * * *
            * * * *
            * * * *
         Note: Get the number of the rows and the columns from user
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();

        for(int r=1; r<=rows; r++){
            for(int c=1; c<=columns; c++){
                System.out.print("* ");
            }
            System.out.println(); //Bu yildizlari yazdirdiktan sonra bir alt satira gecmek icin

        }

        /*
        ex3: Type code to get the output like
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
         */

        System.out.println("Please enter row number: ");
        int row = input.nextInt();

        for(int m = 1; m <=row; m++){

            for(int n=1; n<=m; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }







    }

}
