package javaders.day34exceptions;

public class E03 {

    public static void main(String[] args) {


        System.out.println(getNumOfChars("Java")); //4
        System.out.println(getNumOfChars("Money")); //5
        System.out.println(getNumOfChars("")); //0

        //Bazi  string methodlari null ile calismaz NullPointerException hatasi verir.exeption atarak cozeriz.
        System.out.println(getNumOfChars(null)); //some String methods do not work with null...
                                                    //null
    }                                               //0

    //Bir String'deki karakter sayisini veren method olusturunuz.

    public static int getNumOfChars(String s){

        int result = 0;
        try {

            result = s.length();

            //NullPointerException String Class'da null ile uyumlu olmayan method'lar kullanildiginda atilir.

        }catch (NullPointerException e) {

            System.out.println("some String methods do not work with null...");

            System.out.println(e.getMessage()); // Java'nin exception icin urettigi teknik mesaji varsa verir.

        }
        return result;
    }
}
