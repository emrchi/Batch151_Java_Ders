package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    //****************Non-static Block****************



    public StaticNonStaticBlocks02(){
        System.out.println("Constructor 1");
    }

    public StaticNonStaticBlocks02(int price){
        System.out.println("Constructor 2");
    }

    public StaticNonStaticBlocks02(String name){
        System.out.println("Constructor 3");
    }

    public StaticNonStaticBlocks02(boolean isOld){
        System.out.println("Constructor 4");
    }

    //Non-Static block constructor'larda calistirilmasi gereken ortak kodlari icerir.
    //Non-Static block icine yazilan kod'lar her constructor icin calistirilir.
    //Birden fazla Non-static block varsa usteki once calistirilir.

    {                                               //Non-Static block
        System.out.println("I am constructor-ikinci");
    }

    {                                               //Non-Static block
        System.out.println("I am constructor-ilk");
    }

    public static void main(String[] args) {

        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);

    }
}
