package javaders.day21datetime;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add(5,2,4,3)); //14
        System.out.println(add(5,2)); //7
        System.out.println(add(5)); //5
        System.out.println(add()); //0

       getInitials("Ali Can","Kemal Han","Tuncay Cinar","Ibrahim Catal");

    }
    // Ex1 : Toplama islemi yapan bir metod olusturunuz
    //Asagida ki gibi farkli methodlar olusturarak is yapamayiz.
    // Cunku kullanici fakli sayida ki sayilari toplamak isteyebilir.
    //Her ihtimal icin bir method olusturmak mumkun degildir.
   /*
   public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }

    public int add(int a, int b,int c,int d) {
        return a + b + c + d;
    }
   */

    // If you want to create a method works with any number of parameters, remember to use 'Varargs".
    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya "Varargs" denir
    //"Varargs" arkada "Array" yapisini kullanir.
    // "Varargs" can be declared like "int... v" or "int ...v". There is no any other usage.

    /*
      1)Bir method parantezi icinde birden fazla "Varargs" kullanilamaz. Cunku ilk varargs conteyner'i tamamem doldurulamaz
        ondan dolayi Java ikinci varargs'a yani ikinci parametreye atlayamaz. Bundan dolayi ikinci varargs ulasilmaz"unreachable"
        olur. if you type "unreachable code" in anywhere, Java will give you an error.
      2)Ayni sekilde bundan dolayi Bir method parantezin de birden fazla parametre kulanilacaksa "Varargs" en sonda olmalidir.

     */

    public static int add(int... v){   // bu satirda varargs kullandik sonu belli olmayan arraylist gibi.

        int sum = 0;
        for(int w : v){
            sum = sum + w;
        }
        return sum;

    }

    //Ex2 : Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //      Ali Can ==> AC  Kemal Han ==> KH

    public static void getInitials(String... s){

        String initials = "";
        for (String w :s){
            initials = initials +w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }
}
