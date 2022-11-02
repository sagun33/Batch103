
import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
        //           Ramazan ==> Rn

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz...");
//        String isim = input.next();
//
//        //1.yol
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length() - 1);//Yazdığınız code sadece bazı durumlar için çalışırsa o code'a "Hard Coding" denir.
//        //Yazdığınız code sadece her durum için çalışırsa o code'a "Dynamic Coding" denir.
//
//        System.out.println("" + ilkHarf + sonHarf);
//
//        //2.yol
//        String ilk = isim.substring(0, 1);
//        String son = isim.substring(isim.length() - 1);
//        System.out.println(ilk + son);
//
//        //Example 2: Verilen String'deki sadece hayvan isimlerimni ekrana yazdiriniz
//        //"Ben kedi esim tavuk oglum inek sever"
//
//
//        //substring'in 2 kullanimi vardir
//        //1)substring(baslangic indexi, bitis indexi) Strin'in ortasindan bir parca almaya yarar.
//        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
//        String str = "Ben kedi, esim tavuk, oglum sever inek";
//        String kedi =str.substring(4,8);
//        String tavuk = str.substring(15,20);
//        String inek = str.substring(34);
//        System.out.println(kedi+tavuk+inek);

        //Example 3:ilk isim ve soy ismi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz.
        // Ali can ==>AC  Tahsin Yurdakul==>TY

//        System.out.println("ilk ve soyisminizi giriniz");
//        String tamIsim = input.nextLine();
//        String a = tamIsim.substring(0,1);
//        String b = tamIsim.split(" ")[1].substring(0,1);
//        System.out.println(a+b);
//



    }
}