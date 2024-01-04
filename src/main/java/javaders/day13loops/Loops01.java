package javaders.day13loops;

public class Loops01 {

    public static void main(String[] args) {

        //21 den 180'e kadar hem 4 hem 6 ile bolunebilen tamsayilari console'a yazdiriniz.

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        //Size verilen kucuk harfle yzilmis String'in index'i cigt sayi olan characterlerini buyuk harfe donusturunuz.

       String str = "miami";
            for (int j = 0; j < str.length(); j++) {
                String ch = str.substring(j, j + 1);
                if(j%2==0){
                    System.out.print(ch.toUpperCase());

                }else{
                    System.out.print(ch);
                }

            }
        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==>Hello J
        String s = "Hello Java";
            for (int k = 0; k < s.length(); k++) {

                char ch = s.charAt(k);
                if (ch == 'a') {
                    break;        // Loop'u herhangi bir sarta gore kirmak durdurmak icin "break" keyword kullanilir.
                }else{
                    System.out.print(ch);
                }

            }
        System.out.println();
            //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdirin.
            //"Tokatci" ==> ict

        String u = "Tokatci";
            for(int i =u.length()-1; i>=0; i--){
                if(u.charAt(i) == 'a') {
                    break;
                }else{


                    System.out.print(u.charAt(i));
                }

            }


    }
}
