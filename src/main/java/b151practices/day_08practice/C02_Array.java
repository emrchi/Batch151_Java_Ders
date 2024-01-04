package b151practices.day_08practice;

import java.util.Scanner;

public class C02_Array {

    public static void main(String[] args) {

        /*
        Hackerlar bazı harfleri sayılara cevirerek yazısabiliyorlar. Genellikle cevirdikleri harfler su sekilde:

        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        ornegin:
         java ile hersey guzel
         j4v4 1l3 h3r53y guz3l

        Kullanıcıdan bir cumle alınız, 'hacker'ların konusma diline cevireniz.

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = input.nextLine();
        cumle.toLowerCase();

        String arr[] = new String[cumle.length()];
        for(int i=0;i<cumle.length();i++){
            arr[i] = cumle.substring(i,i+1);
            System.out.print(arr[i]);
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("s")){
                arr[i]="5";
            }if(arr[i].contains("a")){
                arr[i]="4";
            }if(arr[i].contains("e")){
                arr[i]="3";
            }if(arr[i].contains("i")){
                arr[i]="1";
            }if(arr[i].contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);

        }

       /*
       yada

       public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("bir cümle yaziniz.");
    String cümle=scan.nextLine();
    String arr[]=cümle.split("");
    for (String w:arr){
        if(w.equals("s")){
            w="5";
        }if(w.equals("a")){
            w="4";
        }if(w.equals("e")){
            w="3";
        }if(w.equals("i")){
            w="1";
        }if(w.equals("o")){
            w="0";
        }
        System.out.print(w);
    }

}
        */






    }

}
