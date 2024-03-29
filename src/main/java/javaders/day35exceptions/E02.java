package javaders.day35exceptions;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java",2)); //v
        System.out.println(getCharFromString("Java",8)); //J


    }

    //Example 1: Bir String'deki character'i index kullanarak alan bir method olusturunuz.

    public static char getCharFromString(String str, int index ) {

       try {
          return str.charAt(index);

           //StringIndexOutOfBoundsException String'lerde olmayan index kullanildiginda atilir

       }catch (StringIndexOutOfBoundsException e) {
           index = Math.abs(index); //index'in mutlak degerini aliyor. Yani negatif sayi ise pozitife ceviriyor.
           index = index % str.length(); //kalan her zaman bolenden kucuktur. Bu sayede index'i lenght'den kucuk yapabildik.
          return str.charAt(index);
       }
    }

}
  /*
  Stringden karakter almak icin charAt() kullaniriz. getCharFromString isimli methodumuz icine
parametre olarak String olan "Java"yi yazdik ve virgul sonrasi index olarak 2 yazdik
ve Java sout icine bunu yazip calistirmamiz ile hata verdi. Olmayan indexi istedigimiz icin
exception olustu. indexin negatif bir sayi olmasi halinde Math.abs() methodu ile negatif indexi
pozitife cevirebiliriz. Exception'i handle ederken catch kisminda Math.abs(idx); yazarak problemi
giderebiliriz. Pozitif sayiya donusen indexi int olan index'e tekrar aktardik.

Index 8 ise, 8.indeximiz yok. Bunun exception'a neden olmamasi icin indexi modules
kullanarak lengthden az cikmasini saglariz. Modules bize kalani verir ve kalan lenghden daha kucuk olacaktir.
Ornegimizde 8. indexi modules ile 4'e bolduk ve kalan 2 oldu. Neden 4'e bolduk? Cunku bizim Stringimizin
lengthi 4'tur. Modules islemi sayesinde olmayan degil olan indexi istemis oluruz.
   */