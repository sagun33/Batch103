package day29abstractioncollections;

public interface Engine extends Vehicle {

    // Child        Parent
    // Class ---> Interface      ==> implements
    // Class ---> Class          ==> extends
    // Interface ---> Interface  ==> extends
    // Interface ---> Class      ==> Mumkun degil

    //interface'lerdeki tum variable'lar otomatik olarak(default) "public" dir.
    //interface'lerdeki tum variable'lar otomatik olarak(default) "final" dir.
    //interface'lerdeki tum variable'lar otomatik olarak(default) "static" dir.
    int price = 2000;
    double weight = 23.5;

    void run();

}