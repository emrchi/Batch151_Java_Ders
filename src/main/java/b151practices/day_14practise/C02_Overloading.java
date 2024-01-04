package b151practices.day_14practise;

public class C02_Overloading {

    public static void main(String[] args) {
        // Aynı classta ayni isimde method olusturunuz

        /*
         Aynı classta, aynı isimde method olusturmak icin;
         1-) parametrelerin data turleri degistirilebilir
         2-) parametrelerin sayısı degistirilebilir
         3-) parametrelerin data turleri farklı oldugunda, parametrelerin yeri degistirilebilir.
         */

        toplama(55,66); //121
        toplama(2.3, 4.5); //6.8
        toplama(1.5,5.38,67.25); //74.13

        carpma(1,2,3); //6
        carpma(1,2,3,4); //24
    }

    private static void toplama(int a, int b){
        System.out.println("iki int deger toplandi: " + (a+b));

    }
    private static void toplama(double a, double b){
        System.out.println("iki int deger toplandi: " + (a+b));

    }
    private static void toplama(double a, double b, double c){
        System.out.println("iki int deger toplandi: " + (a+b+c));
    }

    private static void carpma(int a, int b, int c){
        System.out.println("uc integer deger carpildi: " + (a*b*c));
    }

    private static void carpma(int a, int b, int c, int d){
        System.out.println("dort integer deger carpildi: " + (a*b*c*d));
    }
}
