package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for-each loop kullanarak her elemanin sonuna "!" ekleyiniz
        //Note: loop'lar kendi baslarina "Collection" lari update edemezler bu yuzden Java "iterator" lari olusturdu.
        //Iterator'lar Collection'lari update etmek icin kullanilir.
        for(String w : myList){
            w = w + "!";
        }
        System.out.println(myList);// [Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();

        while(itr.hasNext()){
            String eleman = itr.next();
            itr.set(eleman + "!");
        }
        System.out.println(myList);// [Z!, K!, A!, J!, M!]
    }
}