package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
         Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yi unique yapar.
         Set'lere, çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(Oğrenci numaraları gibi)

         HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali zaman harcamaz b =u yuzden cok hizli calisir.

         HashSet'ler index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz.

         HashSetler:
            1)Tekrarsiz elemanlarda
            2)Sıralama onemli degilse
            3)Hız cok önemliyse
            4)Indeks kullanmazlar
     */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);// [Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemani eklerseniz hata vermez, son ekleneni var olan data nin ustune yazar. (Overwrite)
        emails.add("Mango");
        System.out.println(emails);// [Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);// [null, Apple, Fig, Mango, Apricot, Orange]

    }

}