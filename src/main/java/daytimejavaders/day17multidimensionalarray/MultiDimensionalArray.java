package daytimejavaders.day17multidimensionalarray;

public class MultiDimensionalArray {

    public static void main(String[] args) {


    String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

    //Ex.1: Yukaridaki student Array'inde toplam kac isim oldugunu bulunuz.

        int name = 0;
        for (String[] w : students) {
            name = name+ w.length;
        }
        System.out.println(name);






    }

}
