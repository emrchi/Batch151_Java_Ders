package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    /*
    Method olusturmak icin su 5 adimi takip ediniz
    1. Access Modifeir
    2. Return type
    3. Method name
    4. Method Parantez
    5. { } parantezleri Method Body
    Method bir deger return etmeli

    Note: Main method'un icindeki tum methodlar static olmalidir.
          Bir method'u static yapmak icin access modifier ile return tyepe in arasina
          Static yazmak gerekir.

          Pass by Value:
          1)Java "Pass by Value" kullanir.
          2)Yani;Java Method'larin orjinal degeri degistirmesine izin vermez.
          3)Java Method'lara deger yollarken orjinal degerin kopyasini olusturur ve
            o kopyayi Method'a yollar.
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur.
          4)Java esnek bir dildir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.
          Bakiniz line 45

          Pass by Reference:
          Reference non primitive data type'larin stack memory' deki adresidir.
          1)Pass by Reference da method'a reference yollanir.
          2)Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve
          orjinal degeri degistirir.
          Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable'in orjinal degerini degistirir.
     */


    public static void main(String[] args) {

        int shirthPrice = 200;

        System.out.println(discount("student",shirthPrice));
        System.out.println(discount("veteran",shirthPrice));
        System.out.println(discount("senior",shirthPrice));
        System.out.println(shirthPrice);

        shirthPrice = discount("veteran", shirthPrice);

        System.out.println(shirthPrice);

    }

    //Discount Method'u olusturunuz.
    public static int discount(String type, int price){

        switch(type){
            case "student":
                price =price-20;
                break;
            case "veteran":
                price =price-40;
                break;
            case "senior":
                price =price-30;
                break;
            default:
                price=price;

        }
        return price;

    }

}
