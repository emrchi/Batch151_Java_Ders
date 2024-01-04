package b151practices.day_12practice;

public class C01 {

    String isim = "Hasim";

    int yas = 20;

    public C01(String isim, int yas) { //constructor
        this.isim = isim;
        this.yas = yas;
    }

    public C01() {

    }


    public static void main(String[] args) {

        C01 obj1 = new C01("Nuri", 25);

        System.out.println(obj1.isim + " " + obj1.yas);  //Nuri 25

        C01 obj2 = new C01();
        //Her class da default constructor vardir. Biz bulundugumuz class da kendimiz bir constructor olusturdugumuz
        // icin bu durumda default constructor oldu, silindi. Ondan dolayi Java bizi cons. olusturayim mi diye sordu

        System.out.println(obj2.isim + " " + obj2.yas); //Hasim 20
    }
}



