package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U
        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();

        String harfler[] = str.split("");
        int counter = 0;

        System.out.println(Arrays.toString(harfler));//[J, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i, .]

        for(String w : harfler){

            switch(w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }
        System.out.println(counter);
    }
}