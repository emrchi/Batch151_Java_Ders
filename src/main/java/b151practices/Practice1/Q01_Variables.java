package b151practices.Practice1;

public class Q01_Variables {

    public static void main(String[] args) {


        //Bir variable baslat
        int age = 15;
        int number = 43;
        String isim = "Ali";


        System.out.println("isim = " + isim);
        System.out.println(age);
        System.out.println("number = " + number);


        //Variable degerini kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklere et
        int year = 2022, month = 3, day = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Bir variable degerini guncelle
        year = 2023;
        System.out.println("year = " + year);

        year = 2030;
        System.out.println("year = " + year);

        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //Bir variable deklere et : x
        double x;

        //Bir variable baslat : y
        double y = 55.6;


        //Baska bir variable baslat : z
        double z = 10;

        //x degiskenini y degiskeni ile baslat
        x = y;

        //Variable'i guncelle
        x = 15.3;

        //Degiskenleri yazdir
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

}
