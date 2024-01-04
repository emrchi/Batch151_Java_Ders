package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {

        //while loop ve do-while-loop arasindaki fark:
        //while loop'da Java once kural'i  kontrol eder sonra calistir
        //do-while loop'da Java once calistirir sonra kural'i kontrol eder

        //While loop
        int i= 1;
        while(i<1){  // while loop'da loop body'sinin hic calismamasi mumkundur.(Zero execution is possible)
            System.out.println("while loop");
            i++;
        }

        //do- while loop

        //do-whlile loop' da loop body'si en az bir kere calisir.

        int k=1;
        do{
            System.out.println("do-while-loop");
            k++;
        }while(k<1);

        //Bir oyun mayin gibi... Kullanici bir sayi girsin (kullanici kaybedene kadar), sayi 100' den kucuk ise kullanici kazandiniz mesaji alsin.
        //Diger durumlar da kaybettiniz mesaji alsin.

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("please enter a number");
            int num = input.nextInt();
            if(num<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }


        }while(true);   //burada while icine true yazarak sonsuz loop yaptik cunku sart olana kadar loop devam etmeli.
                        //yani while keyword'u while parantez ici ya true ya falls olabilir. true oldugu surece loop devam eder.
                        //else de lost! yazdirip break yaparak loop'u kiriyoruz ve program durur.
                        //bu saoru da do-while i infinite loop yapmayi gorduk. oda while(true) ile yaptik


        //Kullanicidan alinan bir cumlenin Buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.
        //Kullanici yanana kadar kullanicidan cumle isteyecek.



        do {
            System.out.println("please enter a sentence");
            String s = input.next();


            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence is incorrect grammatically");
                break;
            }

        }while(true);







    }

}
