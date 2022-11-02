package day21accessmodifiersinheritance;



public class AnimalRunner {
    /*
        1)"Inheritance" sayesinde
            i)Code tekrarlarindan kurtuluruz
            ii)Code tamiri(maintenance) kolay olur
            iii)Child Class'lari daha atomic yapmis oluruz
        2)Bir Class'i baska bir Class'in Child Class'i yapmak icin
          "extends" keyword kullanilir. Ilk yazilan Class Child, ikinci
          yazilan Class parent olur
        3)Child Class object'leri Parent Class'dan method ve variable'lari
          kullanabilirler.
        4)Parent Class object'leri Child Class'dan method ve variable'lari
          kullanamazlar.
        5)Object Class her Class'in parent'idir.
          Java da Object Class haric her Class'in parent'i vardir.
          Java'da parent'i olmayan tek Class Object Class dir.
        6)"private" method ve variable'lar Child Class'lar tarafindan kullanilamaz
          "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
          "default" method ve variable'lar ayni package'deki Child Class'lar tarafindan kullanilabilir.
          "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
          Note: "Child Class'lar tarafindan kullanilabilir" olmak "inherit edilebilir" demektir.

        7) 4 tip inheritance vardir
            i)Multilevel Inheritance: Java bunu kabul eder
            ii)Hierarchical Inheritance: Bir parent icin coklu child, Java bunu kabul eder
            iii)Multiple Inheritance: Bir Child'a coklu Parent, Java bunu desteklemez.(Java does not support Multiple Inheritance)
            iv)Single Inheritance: Bir Child Class icin bir Parent Class demektir, Java bunu destekler
     */
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();
        
        Bird b1=new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();



    }

}
