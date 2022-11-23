package day28abstraction;

public abstract class Animal {

    //body'si olmayan method'lar "abstract method" olarak adlandirilir
    //Bir method'u abstract yapmak icin; i)Method body'i sil  ii)"abstract" keuword kullan
    //"abstract method" lar "abstract class" icinde olmalidir.
    public abstract void eat();

    //"abstract class" larda hem "abstract" hem de "concrete"(non-abstract) method kullanilabilir.
    public void drink(){
        System.out.println("Animals drink...");
    }

    //abstract "move" method olusturunuz
    public abstract void move();

}