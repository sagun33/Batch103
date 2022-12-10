package day11loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaUbung {
    public static void main(String[] args) {
        //Example 1: Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz

        String a="madam";
        String arr[]=a.split("");
        List<String> b=new ArrayList<>(Arrays.asList(Arrays.toString(arr)));
        System.out.println(b.stream().filter(t -> t.equals("m")));

    }
    public static void print(String a){
        System.out.println(a+" ");
    }
}
