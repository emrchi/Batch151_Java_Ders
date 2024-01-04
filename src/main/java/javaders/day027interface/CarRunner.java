package javaders.day027interface;

public class CarRunner {

    public static void main(String[] args) {

        Engine.stop(); // stop() method'u static oldugundan Interface ismi (Engine) ile ulastik.

        Honda h = new Honda();
        h.eco(); //eco() method'u static olmadigindan (defaultmethod) object olusturarak ulastik.
                //obje uretmek istedigimiz de interface'in icinden interface abstract class oldugu icin yani body'si olmadigi icin
                //eksik tamamlanmamis class dan uretmek demek eksik obje uretmek demek oldugu icin Java izin vermez.
                //Bizde ondan dolayi child class Hondadan urettik. Yani Child classlardan object uretip cagirabiliriz..



    }
}
