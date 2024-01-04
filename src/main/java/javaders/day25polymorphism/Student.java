package javaders.day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";

    public int age = 23;

    //Encapsulation nedir? Data saklamaktir.(Data hiding)
    //Datayi nasil saklarsin? Access Modifier'ini "private" yaparak.
    //Ozel datalarin butun class'lara acik olmasini engellememiz gerekir.
    // Cunku bir data tum classlara aciksa hacklenebilir


    private String stdId = "AC2023102T";

    private double gpa = 3.87;

    private boolean successful = false;

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
    //Nasil okuruz? "Get method" olusturarak Encapsulate edilmis datanin degerini okuyabiliriz.
    //Sag tusa basip generate yapip getter sececegiz.
    //i)Get method'lari hep public olur,
    //ii)Get method'un "return type" i okudugu variable'in return type'i ile ayni olur.
    //iii)Get method bir boolean variable icin olusturulduysa ismi "is" ile baslar

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    //Encaptulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar.

    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz?
    //Nasil degistirebilir? "Set method" olusturarak degistirebiliriz.
    //Sag tusa basip generate yapariz setter sececegiz.
    //Set methodlar hep public olur.
    //Set methodlarin return type'i hep void olur.
    //Set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    //Set method kullanarak var olan Object uzerinde degisiklikler yaparak o Object'i yeni bir Object gibi kullanabiliriz.
    //Not: Get method'larin diger adi "getter", set method'larin diger adi "setter" dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    //"get"ve "set" methodlari class'a dokunmaz objeleri degistirir.
}
