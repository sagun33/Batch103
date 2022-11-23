package day28abstraction;

public interface Engine {

        /*
            1) Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
            bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.
            "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
            bu yapida "multiple inheritance" a musaade etti.

            2)Interface'lerdeki tum method'lar "abstract" oldugu icin "interface" lere "fully abstraction" denir.
              "Abstract Class" larda abstract method ve "concrete method" bir arada kullanildigi icin
              "Abstract Class" lara "fully abstraction" denmez.
        */

        //interface'lerdeki tum method'lar "abstract" olmak zorundadir.

        //interface'lerde abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
        //Cunku Java o method'un abstract oldugunu bilir.

        //interface'lerdeki tum method'lar Java tarafindan otomatik olarak "public" kabul edilir bu yuzden
        //o method'lar icin "public" yazmaya gerek yoktur.

    //"public abstract void eco();" ile "void eco();" ayni anlama gelir
    void eco();

    void gas();

    void tsi();

    //default keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    //Asagidaki non-static method'dur
    public default int add(int a, int b){
        return a+b;
    }

    //static keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    //Asagidaki method "static method" dur
    public static String update(String str){
        return str + "!";
    }
}