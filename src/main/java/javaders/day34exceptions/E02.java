package javaders.day34exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = {"A","V","A","J"};

        System.out.println(getElement(a,3)); //A
        System.out.println(getElement(a,1)); //A
        System.out.println(getElement(a,4)); //J
        System.out.println(getElement(a,2)); //V

        System.out.println(getElement(a,6)); //J
        System.out.println(getElement(a,-3)); //A
        /*
        a array'imizde 4 eleman var, 6. elemani istersek hata verir. Cunku 6. eleman yok. 6. eleman index 5'tedir
        ve index 5 olmadigi icin, yazdirma islemi yaptigimizda ekranda problem exception olarak yazilir
        ve hangi satirda problem oldugu belirtilir ArrayIndexOutOfBoundsException atarak bu sorunu duzeltiriz. .
         */


    }

    //Bir String Array'den istenilen bir elemani eleman sirasi ile alan method olusturunuz.

    public static String getElement(String[] a, int numOfElement){

        String result ="";

        try {
           result = a[numOfElement-1];   //numofelement-1 ==> element sayisi-1 (inci elemanin indexi demek yani 2. elemanin indexi 1 dir)

            //ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullandiginizda atilir

        }catch (ArrayIndexOutOfBoundsException e) {
            if(numOfElement-1<0){
                result = a[0]; //ilk eleman return et
            }else{
                result = a[a.length-1]; //son elemani return et
            }
        }

        return result;
    }
}
