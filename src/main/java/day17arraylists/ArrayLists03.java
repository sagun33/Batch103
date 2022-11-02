package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
        //              [12, 19, 15, 30, 21]  ==>  19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);

        Collections.sort(a);//List'teki elemanlari kucukten buyuge dizebilmek icin kullanilir
        System.out.println(a);


        int minFark =Integer.MAX_VALUE;
        System.out.println("minFark = " + minFark);
        int sayi1;
        int sayi2;
        System.out.println("minFark = " + minFark);

        for (int i = 1; i < a.size(); i++) {
            minFark = Math.min(minFark, a.get(i) - a.get(i - 1));
        }
        System.out.println(minFark);

        for (int i = 1; i < a.size(); i++) {

            if (minFark == a.get(i) - a.get(i - 1)) {

                sayi1 = a.get(i);
                sayi2 = a.get(i - 1);

                System.out.println(sayi1 + " , " + sayi2);
            }
        }
    }
}












