package b151practices.day_13practice;

public class C02_StaticKeyword {

    //Bu class calistiginda output ne olur. Calisma mantigi nedir.

    static int y;

    int x;

    public C02_StaticKeyword(int i) {
        x+=i;
        y+=i;

    }

    public static void main(String[] args) {

        C02_StaticKeyword obj1 = new C02_StaticKeyword(2);

        C02_StaticKeyword obj2 = new C02_StaticKeyword(3);

        System.out.println(obj1.x + "," + obj2.x + "," + y ); //2,3,5



    }
}
