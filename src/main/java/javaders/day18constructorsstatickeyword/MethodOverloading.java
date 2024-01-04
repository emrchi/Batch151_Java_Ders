package javaders.day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1)Bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
    2)Method Overloading Java'da iyi organizasyon icin onemlidir.
        Method Overloading aplication'in structer'ini guzellestirmek icin yapilir..
    3)Method Overloding yaparken parametre 3 sekilde degistirilebilir:
        i)Parametrelerin sayilari degistirilebilir.
        ii)Parametrelerin data type'larini degistirebilirsiniz.
        iii)Parametrelerin data type'lari farkli ise yerleri degistirilebilir.
        Java checks just the "method name" and "parameters" to understand if the methods are same or not.
        for that acsess modifier return type and body dosnt matter.
        "method name" and "parameters" are called "method signature".

    4)Method Overloading bir class'in icinde olusur. Bu yuzden "private" method'larda overload edilebilir.
        Method Overloading butun access modifeier'larda kullanilabilir.
    5)"Static" metod'lar "overload" edilebilirler.

     */

    public static void main(String[] args) {

        System.out.println(add(3,5)); //Javaya add metodunu cagir dedim. bu ornekte Java 4 secenegi oldugu icin parametrelere bakar.
                                            // iki intiger oldugu icin az is olani yani ilkini secer.

        add(3,3.6);                   //4. yu secer.

    }

    public static int add (int a, int b){       //method
        return a+b;
    }

    private static int add (int a, int b,int c) {       //method
        return a + b + c;
    }

    public static double add (double a, int b) {       //method
        return a+b;
    }

    protected static double add (int a, double b) {       //method
        return a+b;
    }
}
