package javaders.day41Lambda;

public class Utils {

    //javaders.day41Lambda.Utils demek sik kullanilan faydali methodlar demekdir.

    public static int getSquare(int x) {
        return x*x;
    }

    public static boolean isOdd(int x) {
        return x%2!=0;
    }

    public static boolean isEven(int x) {
        return x%2==0;
    }

    public static int getMax(int x,int y) {
        if (x>y){
            return x;
        }else {
            return y;
        }
    }

    public static int getMin(int x,int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static boolean isEvenSmallerThenSeven(int x){
        return (x%2==0 && x<7);
    }

    public static boolean isOddGraterThenEight(int x){
        return (x%2!=0 && x>8);
    }

    public static int getSumOfDigits(int x){
        int sum = 0;
        while(x>0){
            sum = sum + x%10;
            x =x/10;
        }
        return sum ;
    }
}
