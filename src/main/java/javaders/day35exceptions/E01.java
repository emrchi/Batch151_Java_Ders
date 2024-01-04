package javaders.day35exceptions;

public class E01 {

    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2); // 125

        System.out.println(convertStringToInt("12ab") + 2); //14



    }

    //Bir String'i Integer'e ceviren method olusturunuz


    /*
    valueOf(str) methodu String'i integer'a cevirir. "123" olan String'i java sayi gibi gordu ve istedigimiz
    sekilde toplama islemi yapti. ValueOf nethodunu sayi formatinda olmayan bir String ile kullanirsak exception
    aliriz. NumberFormatException aliriz.
     */

    public static int convertStringToInt(String str) {


        try {
            return Integer.valueOf(str);

            //NumberFormatException valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.

        }catch (NumberFormatException e) {

            str = str.replaceAll("[^0-9]","");  //Burada non digit characterler silindi

            return Integer.valueOf(str);
        }
    }
}
