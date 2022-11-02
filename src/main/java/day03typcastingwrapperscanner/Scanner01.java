package day03typcastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    //Scanner kullanicidan data almaya yarar.
    //Scanner kullanici ile etkilesim kurmamizi saglar .Interaktif.
    //Scanner bir Java Class idir.Bu Class i kullanabilmek icin import etmek gerekiyor.
    //Scanner Class i Java nin util kütüphanesindedir

    public static void main(String[] args) {
        //Kullanicidan data almak icin yapilmasi gerekenler
        //1.Adim:Scanner Clas indan obje olusturunuz.
        //2.Adim:Kullaniciya ne yapacagini söylemem gerekiyor.
        //3.Adim:Kullanicidan aldiginiz data yi bir variable nin icine koyun.
        Scanner input = new Scanner(System.in);
        System.out.println("Hey kullanici yasini gir");
        byte age = input.nextByte();
        System.out.println("Hey kullanici senin yasin "+age);

        


    }
}
