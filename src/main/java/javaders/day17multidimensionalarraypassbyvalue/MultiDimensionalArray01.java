package javaders.day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {

     /*
        1)Bir array'in elemanlari da array olursa bu tarz array'lere "Multidimensional Array" denir.
     */

    public static void main(String[] args) {

        // "Multidimensional array" nasil olusturulur?

        String names [][] = new String[3][2];

        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //"Multidimensional array" leri console'a yazdirmak icin "toString()" methodu degil "deepToString()" methodu kullanilir.
        System.out.println(Arrays.deepToString(names)); //[[A, K], [P, M], [C, Z]]

        //"Multidimensional array" icinden spesifik bir eleman nasil yazdirilir?

        System.out.println(names[1][1]); //M

        //"Multidimensional array" icindeki bir array'i yazdirmak.

        System.out.println(Arrays.toString(names[0])); //[A, K]
        System.out.println(Arrays.toString(names[1])); //[P, M]
        System.out.println(Arrays.toString(names[2])); //[C, Z]

        //Kisa yoldan "Multidimensional array" nasil olusturulur?
        // kisa yontemde her bir arraya farkli sayida eleman yerlestirebiliriz.

        String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Ex.1: Yukaridaki student Array'inde toplam kac isim oldugunu bulunuz.

        int sum = 0;
        for(String[]  w :students){

            sum = sum + w.length;

        }
        System.out.println(sum); //8

        //Ex.2: Yukaridaki students Array'inde icinde "m" olan isimleri console'a yazdiriniz.

        for(String[] w :students){

            for(String k : w){

                if(k.contains("m")){
                    System.out.println(k);
                }

            }
        }

        //Bir intefer Multidimensional Array olusturunuz, tum elemanlarin carpimini hesaplayiniz.

        int nums[][] = {{5,4},{2,3,2},{7},};

        int result = 1; // carpma isleminin etkisiz elemani 1 dir

        for(int[] w : nums){

            for(int k : w){
                result = result*k;

            }
        }
        System.out.println(result);


        //Ex4.: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.

        int numbers[][] = {{5,4},{2,3,2},{7},}; //==> {5,4,2,3,2,7}

        //1.Step: Iki boyutlu Array'de kac eleman oldugunu bulan kodu yazdirmaliyiz.
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }

        //2.Step: Tek boyutlu Array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz.
        int newArray[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu Array'deki elemanlari tek boyutlu Array'e transfer edelim.
        int idx = 0;

        for(int[] w : numbers){

            for(int k : w){

                newArray[idx] =k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newArray)); //[5, 4, 2, 3, 2, 7]

        //Ex.5: Bir integer Multidimensional Array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int ages [][] = {{15,4},{12,43,21}}; //==> 4 + 43 = 47

        int small = ages[0][0]; //farzediyoruz cunku small degeri degisecek kod calisinca enson degerini alacak
        int big = ages[1][0]; //farzediyoruz

        for(int[] w : ages){

            for(int k : w){

                small = Math.min(small,k);
                big = Math.max(big,k);
            }
        }
        System.out.println(small+big);









    }
}
