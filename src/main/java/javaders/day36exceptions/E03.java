package javaders.day36exceptions;

public class E03 {

    /*
    Biz method olustururken bazi sartlari icine yazabiliriz. Kodumuzu negatif senaryolara gore exception almak icin
olusturabiliriz.
Kodumuzdan dolayi olusan exception'i nasil hallederiz? Kodumuz icinde throw new IllegalArgumentException yazarak javaya
olumsuz bir durum halinde exception vermesini istemis olduk. Ancak IllegalArgumentException javanin exception'i
olup biz bu exception'in verilmesini istedigimizde kodumuzla saglayabiliriz.

"throws" ile "throw" arasindaki farklar nelerdir?
1)"throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
"throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
3)"throws"dan sonra sadece exception class isimleri yazilir, "throw"dan sonra ise Exception class'dan
object olusturulur. Ornegin throw new IllegalArgumentException()
     */

    public static void main(String[] args) {

        printAge(23);   //23

        try {
            printAge(-12); //IllegalArgumentException
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

    }
    //Example 1 : Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz.

    public static void printAge(int age) {
        if (age<0){
            throw new IllegalArgumentException();
        }

        System.out.println(age);
    }

}
