package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Kullanicidan ilk, orta ve soy ismini, kimlik numarasini  aliniz ve asagidaki formatta ekrana yazdiriniz
        //Ali Mert Can
        //123456789


        Scanner input=new Scanner(System.in);

        System.out.println("ilk isminizi giriniz");
        String ilkIsim=input.next(); // next() datasi kullanicidan String almak icin kullanilir.

        System.out.println("orta isminizi giriniz");
        String ortaIsim=input.next();

        System.out.println("soyisminizi giriniz");
        String soyisim=input.next();

        System.out.println("kimlik numaranizi giriniz");
        String kimlikNo=input.next();

        System.out.println(ilkIsim+" "+ortaIsim+" "+soyisim);
        System.out.println(kimlikNo);







        System.out.println("ilk,orta ve soyisminizi giriniz ve kimlik numaranizi giriniz");
        String ilk=input.next();
        String orta=input.next();
        String soyIsim=input.next();
        String kimlikNo1=input.next();

        System.out.println(ilk+" "+orta+" "+soyIsim);
        System.out.println(kimlikNo1);



        //Next() ile NextLine() metodu arasindaki fark:
        //Next() methodu kullanicidan gelen Stringin sadece ilk kelimesini alir
        //Next.Line() methodu kullanicidan gelen Stringin tamamini ali.

        // 3.yol:



        System.out.println("ilk, orta ve soyisminizi giriniz");
        String tamIsim=input.nextLine();

        System.out.println(tamIsim);

        System.out.println("kimlik numaranizi girin");
        String kimlikNo2=input.next();
        System.out.println(kimlikNo2);




    }
}
