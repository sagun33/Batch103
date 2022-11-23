package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrana "Kazandiniz!" yazdiriniz
        //           Aksi halde ekrana "Kaybettiniz!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.
        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//        int counter=0;
//        do{
//            System.out.println("Bir sayi giriniz");
//            sayi = input.nextInt();
//            if(sayi<100){
//                System.out.println("Kazandiniz!");
//                counter++;
//            }
//        }while(sayi<100);
//        System.out.println(counter +" puan aldiniz ama en sonunda kaybettiniz");


        //Example 2: Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz
//        int counter=0;
//        do{
//            System.out.println("Isim giriniz");
//            char ilkHarf = input.next().charAt(0);
//            if(ilkHarf>='A' && ilkHarf<='Z'){
//                System.out.println("Ismi basariyla girdiniz");
//                counter++;
//            }else{
//                System.out.println(counter + "  kez isminizin bas harfini buyuk olarak girdiniz en sonunda " +
//                        "Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
//                break;
//            }
//        }while(true);

        //Infinite Loop: Sonsuz dongu

        //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsal" i olusur.
//        for(int i=0; i<4; i++){
//            System.out.println("Hi!");
//        }
        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
//        for (int i = 1; i < 4;   ) {
//            System.out.println("Hi!");
//        }

        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
//        int i = 12;
//        while(i<15){
//            System.out.println("Hi!");

//        }
    }
}

