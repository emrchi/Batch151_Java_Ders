package javaders.day34exceptions;

public class E01 {

    /*
    1)"Exception" beklenmedik problem demektir
    2)"Exception"i halledebilmek icin iki temel yol vardir
        i)"Exception"a uygun cozumler uretebilirsiniz "Exception Handling" denir. Yedek lastik bulundurmak gibi.
       ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir. Yol yardimi beklemek gibi.
    3)"Exception"a uygun cozumler uretme de "try-catch" kullanilir.
      "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
      Java islemi problemsiz sekilde yaparsa "catch block" Java tarafindan okunmaz.
      "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer,
      ve "catch block" icinde ki kodlar calisir.
    4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
   */


    /*
    "Exception" beklenmedik problem demektir. "Exception"a uygun cozumler uretilebilir, buna "Exception Handling" denir
Mutlu senaryolarda catch kismi calismaz. Cunku seyahate ciktin, benzinin bitmedi, lastigin patlamadi.
Sorun olmayinca 911’i aramaya gerek yok. Kotu senaryo halinde ornek 6’yi 0’a bolmesini isteyince Java
bolme islemini matematik kurallarina gore bolemeyince AritmeticException atiyor ve ekrana olusan problem yaziyor.
AritmeticException matematik ile ilgili butun problemleri handle edebilir. Catch kismi icinde olusacak problemler
ile ilgili kodlar yazabiliriz. Mutlu senaryoda, java try kismina gider ve bolme islemini yaptiktan sonra atama opeartoru
bolum olan sonucu result’in icine koyar. result=a/b; bolum 4 oldugu icin sifir yerine 4 oldu ve 4’u yazdirdi.
Istersek basta 0 degeri verdigimiz result’in altina sout ile mesaj yazabiliriz.
Negatif bir durum olmadigi icin java once mesajimizi sonra 4 olan sonucu ekrana yazar.
Negatif senaryoda ornek 6/0 istedik. Java bolemedigi icin ArtimeticException atar(Throw Exception).
AritmeticException matematik ile ilgili bir kural ihlali varsa atilir. Java bu exception’i alir almaz  kosa kosa catch
kismina gider. Artik catch kismi calisir. Exception catch icinde yakalandi. catch icinde sout ile javaya requirement
neyse ona gore problemle ilgili mesaj verdik. Java mesaji gordu ve yazdirdi. Sonra try catch kismi bitince javaya
result’I return et dedik. Result 0 idi, burada degisim olmadi cunku bolme yapilamadi ve sifir’i yazdirdi.
Exception oldugunda sonraki kodlar calismaz yani application’iniz donar. Toplama, cikarma ve carpmada sorun olmaz,
Bu nedenle try catch demeye gerek yok, dogrudan return a+b; yazabiliriz. Ancak bolme isleminde sorun cikabilir.
Sorun cikmasi beklendiginde try catch yapmaliyiz.
Exception’i handle ederken if kullanmamaliyiz.  */




    public static void main(String[] args) {

        System.out.println(divide1(12,3));//4
        System.out.println(divide1(6,0));//0
        System.out.println(divide2(12,3));// I am here 4
        System.out.println(divide2(6,0));//Do not divide any number by zero 0

    }
    //1.Way: Exception'i handle etmede ilk yol. Kullanilmamasi gereken yol.
    public static int divide1(int a, int b) {
        if(b==0){
            return 0;
        }else {
            return a / b;

        }
    }
    //2.Way: Exception'i handle etmede harika yol.
    public static int divide2(int a, int b) {
        int result = 0;
        try{
            result = a/b;

            System.out.println("I am here"); //bu kod  a/b code'unda exeption varsa calismaz yoksa calisir.

            //ArithmeticException matamatik ile ilgili herhangi bir kural ihlali yapildiginda atilir.

        }catch (ArithmeticException e){

            System.out.println("Do not divide any number by zero");
        }
        return result;   // method'un return type'i void degil ise return mutlaka yazmaliyiz.
    }

}



