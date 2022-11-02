package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Kullanicidan islem ve ikitane sayi alarak
        // islemin sonucunu ekrana yazdiran basit bir hesap makinesi yapiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz,+,-,*,/,%");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayiyi giriniz");
        double ilk =input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double ikinci = input.nextDouble();

        switch(islem){
            case'+':
                System.out.println(ilk+ikinci);
                break;
            case'-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '&':
                System.out.println(ilk%ikinci);
                break;
            default:
                System.out.println("Bu islem tamamlanmistir");
                //Not:switch de sadece int ,byte,short,char,String data tipi kullanilir
                //double,float,long,boolean kullnilmaz
                //Eger 3 ten fazla durum varsa switch() tercih ederim.
        }



    }
}
