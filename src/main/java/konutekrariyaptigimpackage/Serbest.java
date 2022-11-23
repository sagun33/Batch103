package konutekrariyaptigimpackage;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Serbest {
    public static void main(String[] args) {
        //Example 1: Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz.
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);
        Collection<Integer> age = studentAges.values();
        int sum = 0;
        int counter = 0;
        for (Integer w : age
        ) {
            if (w != null) {
                sum += w;
                counter++;
            }


        }double average = sum / counter;
        System.out.println("average = " + average);

        //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        //           [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        Set<String> key=studentAges.keySet();
        int top=0;
        for (String w:key
             ) {
            if (w!=null&& !w.startsWith("A")){
              top+=w.length();

            }

        }
        System.out.println(top);
    }
}

