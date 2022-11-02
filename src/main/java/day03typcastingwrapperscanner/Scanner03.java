package day03typcastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan bir diktörtgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double en = input.nextDouble();
        System.out.println("Dikdortgenin uzun kenarini giriniz");
        double boy = input.nextDouble();

        System.out.println("Alan  "+en*boy);
        System.out.println("cevre  "+2*(en+boy));
    }
}
