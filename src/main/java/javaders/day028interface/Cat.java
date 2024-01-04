package javaders.day028interface;


//Burada eat ve drink methodlarini Override ettik cunku Cat Class concrete Class.

public class Cat implements Mamal{

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {

        //interface'lerden variable cagirirken "interface" adini kullanarak cagirin.
        //Bu hem "static" variable olmanin geregidir, hemde okunurlugu artirir.

        System.out.println(Animal.age);  //4
        System.out.println(Mamal.feedBaby);  //Milk
        System.out.println(Mamal.age); //6
    }
}
