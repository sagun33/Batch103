package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Kullanicidan gün sayisini aliniz ve gün ismini ekrana yazdiriniz.
        // 1==> Pazar    2==>Pazartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz");
          int gunNo = input.nextInt();

        //1.yol
//        if (gunNo == 1) {
//            System.out.println("Pazar");
//        } else if (gunNo == 2) {
//            System.out.println("Pazartesi");
//
//        } else if (gunNo == 3) {
//            System.out.println("Sali");
//
//        } else if (gunNo == 4) {
//            System.out.println("Carsamba");
//
//        } else if (gunNo == 5) {
//            System.out.println("Persembe");
//
//        } else if (gunNo == 6) {
//            System.out.println("Cuma");
//
//        } else if (gunNo == 7) {
//            System.out.println("Cumartesi");
//
//        } else {
//            System.out.println("Gecerli gun sayisi giriniz");
//        }
//        //2.yol :Switch ile cözünüz

        switch (gunNo) {
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun sayisi giriniz");

        }
    }
}
