package day05ifstatement;

import java.util.Scanner;

public class IfStatement04 {

    //Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
    //Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
    //i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
    //ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.

    public static void main(String[] args) {
//        // Example 1: Kullanicidan gun isimlerini aliniz,
//        // o günün haftasonu mu hafta ici mi oldugunu kullaniciya söyleyiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi  giriniz");
        String gun = input.next();
////        //1.Yol:
//        if (gun.equalsIgnoreCase("pazar")) {
//            System.out.println("Hafta sonu");
//        } else if (gun.equalsIgnoreCase("pazartesi")) {
//            System.out.println("Hafta ici");
//        } else if (gun.equalsIgnoreCase("sali")) {
//            System.out.println("Hafta ici");
//        } else if (gun.equalsIgnoreCase("Carsamba")) {
//            System.out.println("Hafta ici");
//        } else if (gun.equalsIgnoreCase("Persembe")) {
//            System.out.println("Hafta ici");
//        } else if (gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Hafta ici");
//        } else if (gun.equalsIgnoreCase("Cumartesi")) {
//            System.out.println("Hafta sonu");
//        } else {
//            System.out.println("Gecerli bir gün ismi giriniz");
//        }
//        //2.yol
//        if (gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("Cumartesi")) {
//            //if parantezi icerindeki kodlari mümkün oldugunca kisa yazmak gerekiyor
//            System.out.println("Hafta sonu");
//        } else if (gun.equalsIgnoreCase("pazartesi") ||
//                gun.equalsIgnoreCase("sali") ||
//                gun.equalsIgnoreCase("Carsamba") ||
//                gun.equalsIgnoreCase("Persembe") ||
//                gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Hafta ici");
//        } else {
//            System.out.println("Gecerli bir gün ismi giriniz");
//        }

        //3.yol //if parantezi icerindeki kodlari mümkün oldugunca kisa yazmak gerekiyor
         boolean haftaSonu = gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("Cumartesi");
         boolean haftaIci  = gun.equalsIgnoreCase("pazartesi") ||
                             gun.equalsIgnoreCase("sali") ||
                             gun.equalsIgnoreCase("Carsamba") ||
                             gun.equalsIgnoreCase("Persembe") ||
                             gun.equalsIgnoreCase("Cuma");




//            if (haftaSonu) {
//                System.out.println(" Hafta Sonu...");
//            } else if (haftaIci) {
//                System.out.println(" Hafta ici...");
//
//            } else {
//                System.out.println(" Yanlis gun ismi girdiniz");
//            }

            //Iki standart
               // 1.Tekrardan kacinin
               // 2.Parantez iclerini kisa ve sade tutun


        }
    }



