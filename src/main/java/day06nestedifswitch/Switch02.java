package day06nestedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz.


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismi giriniz");
        String ayIsmi = input.next();
        switch (ayIsmi) {
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "Ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecerli bir ay ismi giriniz");
        }
    }
}
