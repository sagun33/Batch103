package konutekrariyaptigimpackage;

import java.util.Scanner;

public class RunnerALanVeCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double en = input.nextDouble();
        System.out.println("Dikdortgenin uzun kenarini giriniz");
        double boy = input.nextDouble();

        System.out.println("DikdortgeninAlaniVeCevresi.dikdortgeninAlani() = " + DikdortgeninAlaniVeCevresi.dikdortgeninAlani(en,boy));
        System.out.println("DikdortgeninAlaniVeCevresi.dikdortgeninCevresi(en,boy ) = " + DikdortgeninAlaniVeCevresi.dikdortgeninCevresi(en, boy));
    }
}
