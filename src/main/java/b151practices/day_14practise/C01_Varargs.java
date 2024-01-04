package b151practices.day_14practise;

public class C01_Varargs {

    public static void main(String[] args) {

        /*
        parametre olarak bir int ve istediginiz kadar String olan bir method olusturun,
        en uzun String'in harf sayisi ile int parametre degeri carpıp sonucu yazdırın
         */

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        System.out.println(carpim(sayi, str1, str2, str3)); //30

    }

    private static int carpim(int sayi, String... str) {

        String enUzunString = "";
        for (String w :str){
            if(w.length() >enUzunString.length()){
                enUzunString = w;
            }
        }
        int sonuc = sayi*enUzunString.length();
        return sonuc;


    }
}
