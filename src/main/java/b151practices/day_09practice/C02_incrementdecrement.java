package b151practices.day_09practice;

public class C02_incrementdecrement {

    public static void main(String[] args) {


        int a = 15;
        int b = a++;

        System.out.println(b); //15 cunku soldan saga calistigi icin once a yi b ye assign ediyor sonra a yi 1 arttiriyor.
        System.out.println(a); //16


        int sayi1 = 10;
        int sayi2 =20;
        int sayi3 =30;

        sayi2 = sayi1++;
        System.out.println(sayi2); //10
        System.out.println(sayi1); //11

        sayi3 = ++sayi1;
        System.out.println(sayi3); //12 cunku once arttirdik sonra assing ettik
        System.out.println(sayi1); //12
        System.out.println(sayi3++); //12 cunku sayi3 u once yazdiriyoruz sonra arttiriyoruz.
        System.out.println(sayi3); //13
        System.out.println(sayi3+1);//14
        System.out.println(--sayi2); //9 once azaltiyor sonra yazdiriyor

        sayi2++;
        System.out.println(sayi2); //10 sayi2 yi bir arttirdik sonra yazdirdik.
        System.out.println(sayi2--); //10
        System.out.println(sayi2); //9

        System.out.println(sayi3++); //13
        System.out.println(sayi3); //14


    }
}
