package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
//        Not:char Variable lari matematiksel islemlerde kullanirsaniz Java onlarin ASCII degerlerini kullanir.
//         Ornegin:System.out.println('A' + 'C') ekrana AC yerine 132 yazdirir.Javada +  sembolünün iki anlami vardir.
//         1.si: toplama islemi
//         2.si:Birlestirme islemi(Concanitation)
//        Java + sembolü görünce önce toplama yapmaya calisir,yapamazsa birlestirme islemi yapmaya calisr,
//         o da olmazsa hata verir
//        Kullanicidan ilk ve soyismini aliniz, ilk ve soyisminin ilk harflerini ekrana yazdiriniz?
//        1.yol
//         Scanner input = new Scanner(System.in);
//        System.out.println("ilk isminizi giriniz");
//        char ilk = input.next().charAt(0);
//        System.out.println("soyisminizi giriniz");
//        char son = input.next().charAt(0);
//        System.out.println("" + ilk + son);



        //2.yol
        Scanner input = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");
        String tamIsim = input.nextLine();
        char ilkHarf = tamIsim.charAt(0);

        System.out.print(ilkHarf);
        char soyisminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyisminIlkHarfi);
    }
}


