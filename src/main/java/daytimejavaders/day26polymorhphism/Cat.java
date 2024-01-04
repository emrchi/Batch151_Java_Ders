package daytimejavaders.day26polymorhphism;

public class Cat extends Animal{

    public void meow() {
        System.out.println("cats meow");    }

    @Override
    public void eat() {
        System.out.println("Cats eat");

    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }
}
