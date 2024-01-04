package b151practices.Practice1;

public class Q04_Hipotenus {

    //Hipotenus hesaplayan method uretin.

    public static void main(String[] args) {


        double hipotenus = hipotenusHesabi(3, 4);
        System.out.println("hipotenus = " + hipotenus);

    }
    // dikKenar1 = "x";
    //  dikKenar2 = "y";


    public static double hipotenusHesabi(double x, double y) {

        double hipotenus = Math.sqrt(x * x + y * y);
        return hipotenus;


    }
}
