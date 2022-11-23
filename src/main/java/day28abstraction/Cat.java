package day28abstraction;

public class Cat extends Mammal{

        /*
            Bir method "parent class" da "abstract method" ise;
            Child Class o method'u "override" edip kullanmak zorundadir.
            Bu yuzden her hangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method'u "abstract" yapmalisiniz.
         */

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }


}
