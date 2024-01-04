package b151practices.Practice1;

public class C01BasamaklaraAyirma {

    public static void main(String[] args) {

        //12345 sayisinin rakamlari toplamini bulunuz.

        int sayi =12345;
        int sayi1 = sayi %10; // birler basamagi 5
        int sayi2 = (sayi/10) %10; //onlar basamagi 4
        int sayi3 = (sayi/100) %10; // yuzler basamagi
        int sayi4 = (sayi/1000) %10; // binler basamagi 2
        int sayi5 = (sayi/10000) %10; // onbinler basamagi 1
        System.out.println("Toplam = " + (sayi1 + sayi2 + sayi3 + sayi4 + sayi5));

    }



}
