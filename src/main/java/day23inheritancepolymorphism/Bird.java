package day23inheritancepolymorphism;

public class Bird extends Animal{

    /*
        "final" keyword nedir?

        "final" keyword i)Variable'larda kullanilabilir
                            public final int age = 12;
                            a)Atanan deger degistirilemez.
                            b)Deger atamasi yapmak zorundasiniz.

                        ii)Method'larda kullanilabilir
                            public final int add(){
                                   return a+b;
                            }
                            a)Bir method olusturulurken "final" olarak olusturulmus ise
                              o method'un body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                        iii)Class'larda kullanilabilir
                            Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz.
                            Bir Class "final" ise o Class'a extend edilemez.
                            "final" Class Child olabilir.
     */
}