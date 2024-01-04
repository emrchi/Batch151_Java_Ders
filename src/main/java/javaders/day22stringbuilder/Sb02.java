package javaders.day22stringbuilder;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy

        sb1.reverse(); //String'in ters cevrilmesi loop'lar ile de yapilir yada stringbuldier kullanilarak
                      // reverse() method'u kullanilabilir. bu kisa bir yoldur.
        System.out.println(sb1); //ysae si avaJ

        sb1.deleteCharAt(6); //index'i vereceksiniz o indexdeki karakteri silecek.
        System.out.println(sb1); //ysae s avaJ

        sb1.delete(4,7); //Baslangik indexi(dahil) ve bitis indexini(haric) ver, bu index araliklarini silecek.
        System.out.println(sb1); // ysaeavaJ

        sb1.replace(2,5,"XXXXX"); //Baslandik(dahil) ve bitis(haric) indexleri arasini verilen yeni karakterle degistirir.
        System.out.println(sb1); // ysXXXXXvaJ

        sb1.insert(3,"2023"); //ilk uc karakteri gec araya 2023 ekle
        System.out.println(sb1); // ysX2023XXXXvaJ



        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Kava");


        int r1 = sb2.compareTo(sb3); //iki sitring builder'i alfabetik olarak karsilastirir.
        System.out.println(r1); //0 ==> alfabetik olarak ayni siradalar demektir.
        int r2 = sb2.compareTo(sb4);
        System.out.println(r2); //-1 ==> alfabetik olarak sb2 sb4 den alfabetik olarak 1 onde demektir.
                                //sonuc -3 ise alfabetik olarak sb2 sb4 den alfabetik olarak 3 onde demektir.
                                //sonuc 3 ise alfabetik olarak sb2 sb4 den alfabetik olarak 3 sonra demektir. askii degerlere gore

        sb2.toString(); //String Builder'i String'e ceviriyor.

        //StringBuilder nasil String'e cevrilir?
        //toString(); is converting "StringBuilder" to "String".
        String str = sb1.toString().toUpperCase();
        System.out.println(str);// String olan YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);// StringBuilder olan YSX2023VAJ

        sb1.insert(2, "Money", 1,4);// ilk iki karakteri gec ve string'i ayir araya yeni stringin 1den 4e kadar olani ekle.
        System.out.println(sb1); //



    }
}
