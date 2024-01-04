package javaders.day44Lambda;

public class deneme {


    public static void main(String[] args) {
        int [] arr = {1, 3,4,5, 3, 1, -1,-2};
        int max=0;
        int indexOfMax =0;

        for (int j : arr) {
            max = Math.max(j, max);
        }
        for (int i =0; i<arr.length; i++){
            if (arr[i]==max){
                indexOfMax=i;
            }
        }
        boolean mountain1= true ;
        for (int i =1; i<=indexOfMax; i++){
            if (arr[i - 1] > arr[i]) {
                mountain1 = false;
                break;
            }
        }
        boolean mountain2= true;
        for (int i =indexOfMax+1; i<arr.length; i++){
            if (arr[i - 1] < arr[i]) {
                mountain2 = false;
                break;
            }

        }
        if (mountain1 && mountain2){
            System.out.println("Yes it is mountain :)");
        }else {
            System.out.println("No it is not a mountain array");
        }

    }
}


