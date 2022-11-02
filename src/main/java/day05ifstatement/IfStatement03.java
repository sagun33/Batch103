package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Example 1: Kullanici gün numarasini girsin.kod gün ismini yazsin.
        //  2==>Pazartesi    5==>Persembe
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz");
        byte gunNo = input.nextByte();

        if (gunNo==1){
            System.out.println("Pazar");
        }else if (gunNo==2){
            System.out.println("Pazartesi");
        }if (gunNo==3){
            System.out.println("Sali");
        }else if (gunNo==4){
            System.out.println("Carsamba");
        }if (gunNo==5){
            System.out.println("Persembe");
        }else if (gunNo==6){
            System.out.println("Cuma");
        }else if (gunNo==7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gun numarasi giriniz.Gecerli gun numaralari 1,2,3,4,5,6,7 den birisidir");
        }
    }
}
