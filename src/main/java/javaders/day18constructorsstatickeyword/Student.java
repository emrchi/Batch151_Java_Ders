package javaders.day18constructorsstatickeyword;

public class Student {

    /*
        1)"Static" "Class member"lar(variable+method+constructor+code blocks) tum object'ler tarafindan paylasilir.
        2)"Static" "Class member"lardaki degisiklikler tum object'ler tarafindan otomatik olarak gorulur.
        3)"Static" "Class member"lar gokteki ayin dunyaya bagli oldugu gibi, Class'a baglidirlar.
          Bu yuzden "Static variable"lara "Class variable" da denir.
        4)"Static" "Class member"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari
          object'e baglayarak dusunmek bu konuyu kolaylastirir.
        5)"Static" "Class member"lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez. look studentRunner class
        6)"Non-Static" "Class member"lari cagirmak icin object olusturmak sarttir. look studentRunner class
     */

    public static int numOfRegisteredStd = 0; //Static Variable
    public int num = 0; //NonStatic variable

    public Student() {      //Constructor ==>  every object(student) creation we are increese number of student and num
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) { //Main method

        System.out.println(numOfRegisteredStd);//0

        Student s1 = new Student(); //Object
        System.out.println(numOfRegisteredStd);//1   static oldugu icin direk ulasabiliyoruz
        System.out.println(s1.num);//1 static olmadigi icin object ile ulasabiliyoruz.

        Student s2 = new Student(); //Object
        System.out.println(numOfRegisteredStd);//2 static oldugu icin s2 objesi s1 in yaptigi degisikliklerin farkinda ve 1 arttirdi
        System.out.println(s2.num);//1 nonstatic oldugu icin second object doesn't know anything about to update on the first object

        Student s3 = new Student(); //object
        System.out.println(numOfRegisteredStd);//3
        System.out.println(s3.num);//1


    }
}
