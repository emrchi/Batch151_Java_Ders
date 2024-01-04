package javaders.day18constructorsstatickeyword;
public class StudentRunner {

    public static void main(String[] args) {


        System.out.println(Student.numOfRegisteredStd); //numOfRegisteredStd variable'i Static oldugu icin cagirmak icin
                                                        // object olusturmaya gerek yok sadece class ismini kullandik.

        Student s1 = new Student(); //num variable'i Non-static oldugu icin
        System.out.println(s1.num); //cagirmak icin object olusturduk.

        System.out.println(s1.numOfRegisteredStd);//Static olan "numOfRegisteredStd" variable'ina object uzerindende ulasabilirsiniz ama bu hatadir.







    }
}
