package javaders.day26abstraction;


/*
1) Bazen Parent Class'daki methodun body'si hicbir child class tarafindan kullanilmaz.
    Bu durumda parent'daki method'a body yazmak hic kullanilmadigi icin mantikli degildir.
    Biz de o methoda body yazmayiz,.
2) Body'si yazilmayan method'a "Abstract Method" denir.
    Abstract Ingilizce'de vucutsuz yada soyut anlamindadir.
3) Method'un body'sini yazmayinca java hata verir, bizde "abstract" keyword'unu kullanarak
    Java'ya bu method'un body'si olmayacak deriz.
4) "abstract" keyword'unu kullaninca elde ettigimiz abstract method normal class'lara
    konulamaz, o yuzden class'i da "abstract" yapariz.
5) Parent'daki method "abstract" ise butun child class'lar o methodu override etmek zorundadir.
    Bu yuzden tum child'lar icin mecburi olmasini istedigimiz fonksiyonlari
    "abstract" yapmak mantikli bir secimdir.
6) Body'si olan methodlar(Concrete Method) abstract class'larin icine yazilabilir.
    abstract method'lar concrete class'larin icine yazilamazlar.
7) "abstract" keyword ile "method body" bir method'da ayni anda kullanilamaz.
8) Java "abstract" class'lardan object uretmez..
    "abstract" class'larin icinde "abstract methot"lar olur, "abstract medhod" lar
      body'si olmadigindan "eksik method"lar gibi dusunulebilir.
      Yani abstract class icinde eksik bir yapi barindirir, siz abstract class'dan
      object uretirseniz abstract class icindeki eksiklik object'e yansir ve object
      eksigi olan bir object olmus olur.
      Java bunu istemez cunku eksik object eksik is yapar, bu da application'in
      yanlis calismasina sebep olur.
      Java application'u korumak icin "abstract class"lardan object uretilmesini
      engellemistir.
9) "abstract" class'larin constructor'i vardir ama object olusturamazlar.
10)Final method'lar abstract olamazlar.
11)Java private metodlarin abstract edilmesine musade etmez.
cunku abstract methodlar child class'larda override edilmek zorundadir, but private metodlar override edilemez.
12)"abstract" class'in abstract child'i veya concrete child'i olabilir.
 */



/*
        "final" keyword'u aciklar misiniz ?  Interview sorusu..

        "final" keyword i)Variable'larda ii)method'larda iii)class'larda kullanilir.

        i)variable'larda kullanildiginda a)o variable'a kesinlikle deger atamasi yapilmalidir,
                                         b)ilk atanan deger degistirilemez.
        ii)method'larda kullanildiginda  a)o method'un body'si degistirilemez.
                                         b)o method override edilemez.
        iii)class'larda kullanildiginda  a)o class'in child class'i olamaz. parent class olamaz.
                                            ama final class'in kendisi child olabilir.
 */

public abstract class Courses {

    public abstract void math();        //abstract method body'siz yarim method

    public void art(){
        System.out.println("Learn art");       //concrete method body'li tam bir method
    }


}







