package day24statickeywordencapsulation;

public class CarRunner {

        /*
                "static keyword" nedir?
                static keyword class'a baglanmis class elemanlaridir
                static class elemanlari butun Object'lerin ortak elamanidir.
                static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
                static Class elemanlarina Class uzerinden ulasilir.
         */

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(Car.counter);
        //static variable'lara class ismi kullanarak ulasilmalidir
        System.out.println(Car.counter);
        System.out.println(car1.price);


        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);
    }

}
