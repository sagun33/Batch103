import java.util.Scanner;

public class Test_Day01_Day09 {
    public static void main(String[] args) {
           //soru1:
          // Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.

//        String a= "";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz");
//        int sayi = input.nextInt();
//        if (sayi % 2 == 0) {
//            System.out.println("sayi ciftttir");
//        } else   {
//            System.out.println("tek sayidir");
//        }

            //soru 2:Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz
//         // Pazartesi==>Hafta ici        Pazar==>Hafta sonu
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir gun gir");
//        String gun = input.nextLine().toLowerCase();
//         switch (gun){
//             case "pazar":
//                 System.out.println("hafta sonu");
//                 break;
//             case "pazartesi":
//                 System.out.println("hafta ici");
//                 break;
//             case "sali":
//                 System.out.println("hafta ici");
//                 break;
//             case "carsamba":
//                 System.out.println("hafta ici");
//                 break;
//             case "persembe":
//                 System.out.println("hafta ici");
//                 break;
//             case "cuma":
//                 System.out.println("hafta ici");
//                 break;
//             case "cumartesi":
//                 System.out.println("hafta sonu");
//                 break;
//             default:
//                 System.out.println("dogru bir  gun giriniz");
//         }

          //soru3:Password'un ilk harfi büyük harf 'A' olursa "gecerli password" aksi halde "gecersiz password".
          //Password'un ilk harfi kücük harf 'z' olursa "gecerli password" aksi halde "gecersiz password".
//        Scanner input = new Scanner(System.in);
//        System.out.println("password giriniz");
//        String psw = input.nextLine();
//
//        if (psw.charAt(0)>='A' && psw.charAt(0)<='Z'){
//            if (psw.charAt(0)=='A'){
//                System.out.println("gecerli password");
//            }else System.out.println("gecersiz password");
//        }if (psw.charAt(0)>='a' && psw.charAt(0)<='z') {
//            if (psw.charAt(0) == 'z') {
//                System.out.println("gecerli password");
//            } else System.out.println("gecersiz password");
//        }

          // soru 4:Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz
//        Scanner input = new Scanner(System.in);
//        System.out.println("bir islem giriniz");
//        String islem = input.nextLine();
//        System.out.println("iki sayi giriniz");
//        int sayi1=input.nextInt();
//        int sayi2= input.nextInt();
//
//     switch (islem){
//         case "+":
//             System.out.println(sayi1+sayi2);
//             break;
//         case "-":
//             System.out.println(sayi1-sayi2);
//             break;
//         case "*":
//             System.out.println(sayi1*sayi2);
//             break;
//         case "/":
//             System.out.println(sayi1/sayi2);
//             break;
//         default:
//             System.out.println("Gecerli bir islem giriniz");

             //soru 5:Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
             //i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
             //ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-

//             int yil= 2000;
//
//             String lY=yil%100==0 ? (yil%400==0 ? "Leap year" :"leap year degil" ): (yil%4==0 ? "leap year" : "leap year degil");
//             System.out.println(lY);

             //soru 6:Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
             //i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
             //ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
//        String pasw="Kwdd8:1";
//
//        if (pasw.length()>=8){
//           if (pasw.charAt(0)=='i'){//Burada charAt ile yaptim olacakmi diye denedim ve oldu
//               System.out.println("Password gecerlidir");
//           }else System.out.println("Password gecersizdir");
//        }if (pasw.length()<8){
//            if (pasw.substring(0,1).equals("K")){//Burada  ile substring ile  yaptim olacakmi diye denedim ve oldu
//                System.out.println("Password gecerlidir");
//
//            }else System.out.println("Password gecersizdir");
//        }

        //soru7:Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
        //i)En az 8 character icermeli
        //ii)Space characteri icermemeli
        //iii)Ilk harfi "M" veya "m" olmali
        //iv)Son characteri "?" olmali

//        String pasword="msjbbbbbbbk?";
//
//
//        boolean a= pasword.length()>=8;
//        boolean b=!pasword.contains(" ");
//        boolean c=pasword.substring(0,1).equalsIgnoreCase("m");
//        boolean d=pasword.substring(pasword.length()-1).equals("?");
//
//
//  if (a&&b&&c&&d==true){
//        System.out.println("passwordunuz gecerlidir");
//  }else
//        System.out.println("Passwordunuz gecerli degildir");

     //soru 8:Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz
//
//        double sayi=2;
//
//        if (sayi > 0) {
//                System.out.println("sayi pozitiftir");
//        }else if(sayi<0){
//                System.out.println("sayi negatiftir");
//        }else
//                System.out.println("sayi 0 dir");

        //soru 9:You have two integers
        //If both integers are positive multipy
       // If one of both is positive and the other negative, then screen out "I don't know who to multiply"

        int a=0;
        int b=6;
        if (a>0 && b>0)
            System.out.println(a*b);
        else if (a<0 & b>0 || a>0 && b<0){
            System.out.println("I don`t know who to multiply");
        }else System.out.println("e bitti daaa daha ne isteyrsun usagum");

        //soru 10:Bir Strindeki space haric kac tane character kullanildigini gösteren kodu yaziniz
        //Ali okula gitti -> 13 zeichen ohen space

        String str="Ali okula gitti";
        int x=str.replace(" ","").length();
        System.out.println(x);



                }
            }











