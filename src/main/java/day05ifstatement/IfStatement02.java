package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example : Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = input.nextInt();

        // 1.yol:
        if (s % 2 == 0) {
            System.out.println("Cit sayi");

        }
        //"!=" demek esit degil demektir
        if (s % 2 != 0) {
            System.out.println("Tek sayidir");

        }
        //2.yol:
        if (s % 2 == 0) {
            System.out.println("Cit sayi");

        } else {
            System.out.println("Tek sayidir");

        }
        //Example2:
       // Bir sayinin negatif, pozitif veya nötr oldugunu söyleyen kodu yauiniz

        System.out.println("Bir sayi giriniz");
        double d = input.nextDouble();

        if (d > 0) {
            System.out.println("pozitif");

        } else if (d == 0) {
            System.out.println("notr");

        } else {
            System.out.println("Negatif");
        }
    }
}
