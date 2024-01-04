package b151practices.day_17practice;

public class Child2 extends Parent2 {

    /*
    extends yapilan Class'lardaki tum costructor'larin ilk satirinda biz gormesek bile
    super() constroctor call vardir.
    Dolayisiyla once Parent Class'daki constructoe calisir.
     */

    public Child2(int i) {
        super();
        System.out.println("Child2 Class  tek parametreli costructor");
    }
    public Child2() {  // gizli super() var.
        System.out.println("Child2 Class parametresiz costructor");

    }
    public Child2(int i, int i1) {
        super(5,10,25);
        System.out.println("Child2 Class  iki parametreli costructor");
    }

    // Parent2 isminde bir class olusturunuz
    // Child2 class'ı, Parent2 class'a extends ediniz
    // Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent2' den ekran cıktısı alınız

    public static void main(String[] args) {

        Child2 obj1 = new Child2();
        Child2 obj2 = new Child2(1);
        Child2 obj3 = new Child2(3,5);
    }




}
