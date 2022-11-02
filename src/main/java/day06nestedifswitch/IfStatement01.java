package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Type a code, get age from user and decide which stage on it(Kullanicidan yas degerini alan kodu yaziniz
        // ve yasin hangi evrede oldugunu asagidaki tabloya göre ekrana yazdiriniz
        //0 - 4 => baby ==>0 öncesindeki bosluk kismini da doldurmak gerekiyor
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age) // 30 dan sonrasini da bos birakmamak gerekiyor.dolayisiyla görev kismini tamamlamak gerekiyor.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        byte yas =  input.nextByte();
        
        if (yas<=0){
            System.out.println("Gecerli yas giriniz");
        } else if (yas<=4) {
            System.out.println("baby");
        } else if (yas<=12) {
            System.out.println("cocuk");
        } else if (yas<=20) {
            System.out.println("genc");
        } else if (yas<=30) {
            System.out.println("yetiskin");
        }else{
            System.out.println("tanimlanmamis evre");
        }
//Kritik sayilarin öncesi ve sonrasiyla test etmeye
// Baoundary Value analyze Test(BVA)yani Sinir degerlerini analiz ederek test etme.Boundary=Sinir

    }
}
