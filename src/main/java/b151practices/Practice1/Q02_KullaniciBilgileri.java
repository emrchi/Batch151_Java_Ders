package b151practices.Practice1;

import javax.swing.plaf.BorderUIResource;

public class Q02_KullaniciBilgileri {
    /*
	 first name, last name, age, height ve weight değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
	 		First Name: ...
	 		Last Name: ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Not: Sadece bir adet "System.out.println(); kullanınız.
	 */

    public static void main(String[] args) {

        String firstName = "Emre";
        String lastName = "Yilmaz";
        byte age = 44;
        double height = 1.78;
        double weight = 69.5;
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight);


    }


}
