package b151practices.day_05_looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {

    /*
    Kullanicidan aldiginiz 'c' ve 'a' iceren bir String deger icerisindeki
    'c' karakterinden ockeki 'a' karakterlerinin sayisini bulan bir kod yaziniz.
     */

    //1.Way:

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String contains 'c' and 'a' ");
        String str = input.nextLine().toLowerCase();

        int counter = 0;
        for(int i = 0; i <str.indexOf("c"); i++) {
            if(str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("There are " + counter + " a in the String before c");

        //2.Way:

        int sayac = 0;
        if(str.contains("c") && str.contains("a")){

            for(int i =0; i<str.length(); i++) {
                if(str.charAt(i)== 'a') {
                    sayac++;
                }else if(str.charAt(i)=='c'){
                    break;
                }
            }
            System.out.println("c'den onceki a sayisi " + sayac);

        }else{
            System.out.println("Lutfen c ve a harfleri iceren bir kelime giriniz");
        }
    }

}

