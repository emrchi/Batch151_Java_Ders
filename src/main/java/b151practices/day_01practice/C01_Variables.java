package b151practices.day_01practice;

public class C01_Variables {

    public static void main(String[] args) {

        int age = 32;
        int number = 55;
        String name = "Alice";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("name = " + name);

        //Variable degerini kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        String hisName = name;
        System.out.println("hisName = " + hisName);

        //ayni satirda coklu variable deklere et

        int year =2022, month = 9, day = 28;
        System.out.println("day = " + day);
        System.out.println(year+month+day);

        //Bir variable degerini guncelle
        year = 2023;
        year = year+5;

        //Bir Variable deklere et: x
        double x;
        //Bir Variable baslat: y
        double y =3.14;
        //baska bir variable baslat: z
        double z =43;
        //x i y ile baslat
        x = y;
        //x Variable degerini guncelle
        x= z+12;







    }
}
