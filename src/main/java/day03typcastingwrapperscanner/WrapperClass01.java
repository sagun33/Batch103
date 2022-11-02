package day03typcastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
        Java Primitivlere metodlar ekleyerek yeni bir yapi olusturdu.Bu yapiya Wrapper Class denir.
        byte   ==> Byte
        short  ==> Short
        int    ==> Integer
        long   ==> Long
        float  ==> Float
        double ==> Double
        boolean==> Boolean
        char   ==> Character

//        WrapperClasslar Non Primitive'dir.

         */
//        byte primitiveByte=12; //Primitive byte yazip nokta koydugunuzda hic Method göremezsiniz
//                               // cünkü Primitive ler Method icermez sadece deger icerir
//
//        Byte wrapperByte = 12; //wrapperByte yazip nokta koydugunuzda bir cok Method görüyorsunuz.
//        // Cünkü Wrapperla Method icerir.
//
//        // Example 1: byte data type'nin en kücük ve en büyük degerini yaziniz.
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
//        //primitivler nasil wrapperlara cevrilir (Autoboxing)
        float f1 = 13.99f;
        Float wrapperF1 = f1;

        System.out.println("wrapperF1 = " + wrapperF1);
        // wrapperlar primitive lere nasil cevrilir.(Unboxing)
        Character w1 = 's';

        char primitiveW1=w1;
        System.out.println("primitiveW1 = " + primitiveW1);
        //Not:Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir.
        // Ekstra kod yazmamiza gerek yok.

    }

}
