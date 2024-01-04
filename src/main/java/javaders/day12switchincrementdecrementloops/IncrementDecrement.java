package javaders.day12switchincrementdecrementloops;

public class IncrementDecrement {

    /*
    1. Increment artirmak demektir, Decrement azaltmak demektir.
    2. increment toplama ve carpma ile Decrement cikartma ve bolme ile yapilabilir.
    3. increment ve Decrement 3 yolla yapilabilir.
        i) int a = 12; ==> a= a + 5;
        ii) int a = 12; ==> a += 5;
        iii) int a = 12; ==> a ++;
            note: 3. yol sadece 1 artirmak icin kullanilir.

        i) int i = 12; ==>  i = i - 5;
        ii) int i = 12; ==>  i -= 5;
        iii) int i = 12; ==>  i--;
            Note: 3. yol sadece 1 azaltmak icin kullanilabilir.
     */

    public static void main(String[] args) {

        int age = 12;
        System.out.println(age); //12

        //age = age++; post increment
        //System.out.println(age); //12 ==>java soldan geldigi icin ++ yi gormeden age i age konteynrena atiyor ondan 12 aliriz

        age = ++age; // pre increment
        System.out.println(age); //13 ==>java soldan geldigi icin ++ yi gordu age i age konteynrena atiyor ondan 13 aliriz
                                 // buna pre increment denir.

        int salary = 40;

        salary = salary--; //post decrement
        salary = --salary; // pre decrement

    }
}
