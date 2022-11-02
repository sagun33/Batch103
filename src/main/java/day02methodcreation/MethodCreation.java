package day02methodcreation;

import day01variables.Variables01;

public class MethodCreation {
    //Main Methodun icinde kullanacaginiz hersey Static olmalidir
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ucSayidanIkisniToplaUcuncusuyleCarp(2, 3, 3));
        System.out.println(ucSayidanIkisniToplaUcuncusuyleCarp(2, 3, 4));


        //Ekrana birsey yazdirmak icin iki tane kod var :
        // birincisi Println():ln sonraki satira gec demek
        //ikincisi Print():ayni satira yazmaya devam ediyor


        //Void görünce bu method yeni bir data üretmiyor demektir.
        //ekrana birsey yazdirma methodu,bir tusa tiklama methodu gibi//main bu methodun ismi
        // Curly Brace ise ( {} ) Methodun Body sidir.
        // main method arabanin motoru gibidir.
        // main ethod olmadan hic bir sey calismaz.
    }

    // Example 1:Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b) {
        return a + b;


    }

    //Example 2:Üc sayiyi birnbiriyle carpan bir method olusturunuz.
    public static double ucSayiyiCarp(double a, double b, double c) {
        return a * b * c;

    }

    //Example3:Uc sayidan iksini toplayip ucuncu ile carpan method olusturun sonucu ekrana yazdirin
    public static double ucSayidanIkisniToplaUcuncusuyleCarp(double a, double b, double c) {
        return (a + b) * c;

    }

}
