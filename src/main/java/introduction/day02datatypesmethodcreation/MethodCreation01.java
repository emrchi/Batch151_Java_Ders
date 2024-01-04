package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
     java da method nasil olusturulur?

     1)main methodun disin da olusturulur
     2)access modifier + return type + methods name + () + {}
     3)parantez icine parametreleri(datalar sayilar) belirle
     4)method body icine istenen kodu yaz return variable ile
     Note: Main method static oldugu icin mainmethod icerisin de kullanacagimiz hersey static olmalidir.
     Note: Variables used in method parenthesis are called "parameters"

     Olusturulan metodlar nasil kullanilir/
     1)Main Methodun icinden kullanilir(calistirilir)
     2)Method's Name + ()  seklinde yaz.
     3)Islem yapacaginiz "argument" leri (actual values) parantez icine koyun
     Note: Actual values used in method parenthesis are called "arguments"
   */
    public static void main(String[] args) {

         int sonuc = toplamaYap (3,5);
        System.out.println(sonuc);
        System.out.println(toplamaYap(3,5));

         long carpmaSonuc = multiply(3,6);
        System.out.println(carpmaSonuc);

        int uckusonuc =  firstTwoMultiplyThirthAdd(2,3,4);
        System.out.println(uckusonuc);

        System.out.println(getKup(3));

        print("Hello World");

        String r2 = firsAndLastCh("Emre");
        System.out.println(r2);

        int r3 = getSumOfAsciisallChars("Ajda");
        System.out.println(r3);




    }
    //Ornek1: toplama islemi yapan bir method olusturunuz
    public static int toplamaYap (int a , int b ) {
        return a+b;

    }
    //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
    protected static long multiply (int a ,int b) {
        return a*b;

    }
    //Ornek3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan metodu olusturunuz.

    private static int firstTwoMultiplyThirthAdd (int a,int b,int c){
        return a*b+c;

    }
    //Ornek4: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    //Note: ACCESS MODIFIER'I default yapmak icin aaccess modifier YAZMAYINIZ
     static double getKup (double a){
        return a*a*a;

    }
    //Ornek5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz

    public static void print (String str){
        System.out.println(str);
    }
    //methodun return type'i void ise method body icinde return keyword yazilmaz.
    //eger bir method yeni bir data uretmiyor ise return type'i void olur.

    //Ex.6: Create amethod prints the first and the last character of a String on the console

    public static String firsAndLastCh (String s) {
        return  "" + s.charAt(0) + s.charAt(s.length()-1);

    }

    //Ex.7: Create amethod prints the sum of the ASCII values of characters in a String

    static int  sumOfAsciis = 0;

    public static int getSumOfAsciisallChars(String s){
        for (int i=0; i<s.length(); i++) {
            sumOfAsciis = sumOfAsciis + s.charAt(i);
        }
        return sumOfAsciis;
    }
}
