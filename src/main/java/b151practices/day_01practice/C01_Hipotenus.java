package b151practices.day_01practice;

public class C01_Hipotenus {


    public static void main(String[] args) {

        System.out.println("hipotenus(3,4) = " + hipotenus(3, 4));


    }

    public static double hipotenus(double x, double y) {
        double hipotenus = Math.sqrt(x*x+y*y);
        return hipotenus;
    }

}
