package introduction.day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //class ismi + Object Ismi + Atama Operatoru + "new" + Constructor
             Car          myCar            =            new       Car();

             //"new" keyword'u sifirdan yeni bir obje olusturmak icin kullanilir.\
            //Constructor Java'da nesneleri olusturmak icin kullanilan ozel mmethoddur.

        System.out.println( myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();


        Student student = new Student();

        System.out.println("student.name = " + student.name);
        System.out.println("student.grade = " + student.grade);
        System.out.println("student.address = " + student.address);

        student.feed();
        student.study();


    }
}
