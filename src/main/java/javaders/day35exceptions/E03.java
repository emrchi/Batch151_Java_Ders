package javaders.day35exceptions;

public class E03 {

    /*
    1)Try block'dan sonra coklu catch block kullanilabilir.
      catch block'lar arasinda parent-child iliskisi yoksa catc block'lar istenildigi gibi siralanabilir.
      catch block'lar arasinda parent-child iliskisi varsa child uste olmalidir.
    2)"Exception Class" tum Exception'larin Parent'idir.
      Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
      tek catch block'i "Exception Class" ile kullanabilirsiniz.
    3)"try" catch block olmadan kullanilabilir mi?
    (try + 1 catch) olur, (try + cok catch) olur, (try tek basina ) olmaz. (try + finally) olabilir.
     */

    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLength1("124")); //62
        System.out.println(convertStringToIntDivideByLength1("A")); //Non-digit character connot be used in valueOf()
                                                                   //0
        System.out.println(convertStringToIntDivideByLength1("6")); //   /by zero ==> bu javanin teknik mesaji
                                                                   //0
        System.out.println(convertStringToIntDivideByLength2("A")); //For input string: "A" ==> bu javanin teknik mesaji
                                                                    //0

        System.out.println(convertStringToIntDivideByLength2("6")); //   /by zero ==> bu javanin teknik mesaji
                                                                   //0
        System.out.println(convertStringToIntDivideByLength3("6")); //Jump
                                                                    //0
    }


    //ex1: Bir Stringi Integer'a ceviren ve bu Integer'i String'in length'inin 1 eksigine bolen method olusturunuz.

    public static int convertStringToIntDivideByLength1(String str){

        int result = 0;

       try {

           int a = Integer.valueOf(str); //Integer wrapper class'indaki valuOf method'u ile String'i integer'a cevirdik.
           result = a / (str.length() - 1);

       }catch (NumberFormatException e) {

           System.out.println("Non-digit character connot be used in valueOf()");

       }catch (ArithmeticException e) {


           System.out.println(e.getMessage());
       }
       return result;

    }

    public static int convertStringToIntDivideByLength2(String str) {

        int result = 0;

        try {

            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);

        }catch (Exception e) {

            System.out.println(e.getMessage());

        }
        return result;

    }


    public static int convertStringToIntDivideByLength3(String str) {

        int result = 0;

        try {

            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);

            // Bu gibi parent child iliskisi olan Exception classlar'lar da parent daima en sona yazilir..
            //bakiniz asagiya. catch (ArithmeticException e)==> child, catch (Exception e)==> Parent
            //Eger bu iliski yoksa "catch block"lar arasinda siralamanin onemi yoktur

        }catch (ArithmeticException e) {

            System.out.println("Jump");

        }catch (Exception e) {

            System.out.println(e.getMessage());

        }
        return result;

    }
}



    /*
    Bir String'i Integer'a ceviren ve bu integer'i String'in lengthine bolen methodu olusturunuz.
 convertStringToIntDivideByLength isimli methodumuzu olusturduk. parametresi icine String str yazdik.
 int a=Integer.valueOf(str);
 return a/str.length(); ya da return a / (str.length(0-1)
yazdigimizda ve main methoda gidip sout icine bos String "" veya "2" yazinca hata aldik.
15 nolu satirda hata verdi.

valueOf() methodu kullandigimizda NumberFormatException alma ihtimalimiz var.
ValueOf methodu bos Stringde de hata verir. Mutlaka bir rakam vermemiz gerekir. Boylece formatta hata yapmamis oluruz.
Bir methoddan iki farkli exception alma ihtimali var. Bolme islemi de exception verir.
Iki exceptionimiz oldugundan her ikisini birden handle etmemiz sarttir. Bu durumda bir kez try bolumunu
iki kez catch bolumu olusturduk. Catchlerden biri NumberFormatException ile ilgili digeri AritmeticException
ile ilgili olusturduk. Birinde kendi mesajimizi sout icine yazdik, digerinde javanin mesaji varsa gormek
istedik. Onu da e.getMessage() methodunu sout icine yazarak sagladik. Java en once try bolumune gelir.
 str isimli Stringimiz valueOf methodu ile "124" iken 124'e cevrildi. 124 olan degeri bir int conteynerina
 assign ettik. Daha sonra int a'ya atadigimiz sayiyi Stringin length'ine bolduk.
 Length 2 olup, 124/2 bize 62'yi verdi.
Pozitif senaryo olunca artik Java catch bolumune gitmez. Ancak biz String'i "124" degil de "A"
yaptigimizda kural ihlali oldugundan exception verdi ve NumberFormatException yazili catch'e gelir.
Buradaki kod calisir ve buradaki sout calisir. Bu sout ile javanin mesaji varsa ekranda onu gorecegiz.
Biz String icine "A" degil de "6" yaptigimizda hata verecek.
try icinde 6'yi 0'a bolersek java bize bu defa
AritmetikException verir ve Java AritmeticException kismina gelir,
kodun bu bolumu calisir ve oaradaki sout calisir.
Her probleme ozel bir catch yazdik.

Baska bir yontem olarak catch() icine "Exception e" yazarsak tum exceptionlari handle edebiliriz. 911 nolu telefon
gibi her cagriya cevap verir. sout icine javanin mesajini getMessage yontemi ile sorunca bize teknik mesajini
ekarana yazdirdi. catch(Exception e) problemin ne cesit oldugunu anliyor.
(Citizens Advice Burolar gibi, soruna gore yonlendirme)
     */