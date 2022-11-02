import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args) {
        // Question 1
// If Else
//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
//Kural 1: 4 ile bölünemeyen yillar artik yil degildir.
//Kural 2: 4 ile bölünüp 100 ile bölünmeyen yillar artik yildir
//Kural 3: 4'ün kati olmasina ragmen 100 ile bölünebilen yillardan sadece 400'ün kati olan yillar artik yildir.


//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir yil giriniz");
//        int yil = input.nextInt();

//        if (yil%4!=0){
//            System.out.println("artik yil degildir");
//        }else if (yil%4==0  && yil%100!=0){
//            System.out.println("artik yildir1");
//        } else if (yil%4==0 && yil%100==0 && yil%400==0 ) {
//            System.out.println("artik yildir2");
//
//        }else System.out.println("artik yil degildir");

        // Question 2
// Nested if else
//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil
// girmesini isteyin.
//Kural 1: 4 ile bölünemeyen yillar artik yil degildir.
//Kural 2: 4'ün kati olmasina ragmen 100 ile bölünebilen
// yillardan sadece 400'ün kati olan yillar artik yildir.

//        if (yil % 4 != 0) {
//            System.out.println("artik yil degildir") {
//
//                if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0)
//                    System.out.println("artik yildir");
//
//
//                else System.out.println("artik yil degildir2")
//
//
//            }else System.out.println("artik yil degildir");

        // Question 3
// String Manipulation
// Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
// ve asagidaki gibi yazdirin
// isim-soyisim: M***** B*****
// kart no: **** **** **** 1234

//        Scanner input = new Scanner(System.in);
//        System.out.println("isminizi giriniz");
//        String isim = input.nextLine().toUpperCase();
//        System.out.println("soyisminizi giriniz");
//        String soyIsim=input.nextLine().toUpperCase();
//        System.out.println("Kredi karti no girin");
//        String kKN=input.nextLine();
//
//
//
//
//        String yeniIsim=isim.charAt(0)+isim.substring(1).replaceAll("[a-zA-Z]","*");
//        String yeniSoyisim=soyIsim.charAt(0)+soyIsim.substring(1).replaceAll("[a-zA-Z]","*");
//        System.out.println("yeniIsim = " + yeniIsim);
//        System.out.println("yeniSoyisim = " + yeniSoyisim);
//
//        String yeniKartNumarasi=kKN.substring(0,5).replaceAll("\\w","*")+kKN.substring(6,10).replaceAll("\\w","*")+
//                kKN.substring(11,15).replaceAll("\\w","*")+kKN.substring(16);
//
//        System.out.println(yeniKartNumarasi);

        // Question 4
// For Loop
// Kullanicidan 100den kücük bir tamsayi isteyin. 1 den baslayarak girilen sayiya kadar tüm sayilari yazdirin. Ancak
// Sayi 3ün kati ise sayi yerine "Java" yazdirin
// Sayi 5in kati ise sayi yerine "Güzeldir" yazdirin.
// Sayi hem 3un hem 5in kati ise sayi yerine "Java güzeldir" yazdirin.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz");
//        int sayi = input.nextInt();
//        for (int i=1; i<=sayi; i++){
//            if (i%3==0 && sayi%5==0) {
//                System.out.println("Java guzeldir");
//
//            }else if (i%3==0) {
//                System.out.println("Java");
//
//            } else if (i%5==0) {
//                System.out.println("Guzeldir");
//
//            }else System.out.println(""+i);
//        }

        // Question 5
// For Loop
// Kullanicidan bir String isteyin ve String'i tersten yazdirin


//        Scanner input = new Scanner(System.in);
//        System.out.println("Kelime giriniz");
//        String kelime= input.next();

//        String a ="";
//        for (int i =kelime.length()-1; i>=0; i--) {
//
//            a=kelime.substring(i, i+1);
//
//
//            System.out.print(a);
//        }


        // Question 7
// For Loop
// Kullanicidan bir String isteyin. Kullanicinin girdigi String'in palindrome olup olmadigini kontrol eden  bir program yazin.


//        Scanner input = new Scanner(System.in);
//        System.out.println("Kelime giriniz");
//        String kelime = input.next();
//
//
//        String b="";
//
//
//        for (int i = kelime.length() - 1; i >= 0; i--) {
//
//            b += kelime.charAt(i);
//
//
//
//
//
//
//
//        }  System.out.println(b);


        // Question 8
// For Loop
// Kullanicidan 10'dan kücük bir tam sayi isteyin ve girilen sayinin faktöryel'ini bulun
// (5!=5*4*3*2*1)


//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir tam sayi giriniz");
//        int sayi=  input.nextInt();
//        int mult=1;
//         int i;
//        for ( i = sayi; i > 0; i--) {
//            mult*=i;
//            System.out.print(i+ " * ");
//        }
//        System.out.println(" = " + mult );
//
// Question 9
// Nested For Loop
// Kullanicidan bir pozitif bir rakam girmesini isteyin ve girilen rakama göre asagidaki sekilde cizdirin
//  *
//  **
//  ***
//  ***
//          Scanner input = new Scanner(System.in);
//          System.out.println("Pozitif bir rakam  giriniz");
//          int sayi = input.nextInt();
//
//        for (int i = 1; i<=sayi; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(" *");
//
//            }
//            System.out.println();
//
//        }

        // Question 10
// Nested For Loop
// Kullanicidan bir pozitif bir rakam girmesini isteyin ve girilen rakama göre carpim tablosu olusturun.
// örnek, kullanici 3 girerse
//  1 2 3
//  2 4 6
//  3 6 9


//        for (int i = 1; i <= 3; i++) {
//            for (int j = i; j <= i ; j++) {
//                System.out.println(i+ " " +(i+j) + " "+ (i+j*2));
//
//            }
//
//
//
//
//        }
        // Question 11
// While Loop
// Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin.
// Kullanicinin hata yapmadigini farz edin.
//Örnegin, kullanici 3 girerse;
//3x1=3  3x2=6 ....3x10=30

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir rakam  giriniz");
//        int sayi = input.nextInt();
//
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(sayi + " x "+i+" = "+sayi*i);
//
//        }
        // Question 12
// Do While Loop
// Kullanicidan toplamak icin sayi isteyin ve toplam 500'e ulasincaya kadar istemeyi devam ettirin.
// Toplam 500'e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.

//        Scanner input = new Scanner(System.in);
//        int sum=0;
//        int i=0;
//      do {
//          System.out.println("Bir sayi giriniz");
//          int sayi = input.nextInt();
//
//          sum+=sayi;
//          if (sum<500){
//              i++;
//          }
//      }while(sum<500);
//
//        System.out.println(sum);
//        System.out.println(i);
//
//
// Question 13
// Array
// Verilen 3 elemanli bir array'in tüm elemanlarini bir soldaki konuma tasiyacak bir program yazin.
// Örnek, array [1,2,3] ise output [2,3,1] olacak.

//
//        int[] arr = {1, 2, 3};
//
//        int []brr=new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//
//            }System.out.println(brr[i]);
//
//    }
        // Question 14
// Array
// Verilen bir array'in tüm elemanlarini toplayan bir program yazin.
        
//        int [] arr={1,2,3};
//        int sum=0;
//        for (int w:arr){
//            sum+=w;
//
//        }
//        System.out.println("sum = " + sum);
//
//
        // Question 15
// Multi Dimensional Array
// Asagidaki multi dimentional array'in tüm elemanlarinin carpimini ekrana yazdiran bir methode yazin.
// { {1,2,3} , {4,5,6} }

        int [][] arr={ {1,2,3} , {4,5,6} };
        int mult=1;
        for (int [] w:arr){
            for (int k:w){
                mult*=k;
            }
        }
        System.out.println("mult = " + mult);

        // Question 16
// LocalDate
// Bugünkü tarihi yazniz. Bugünden 2 sene, 2 ay, 2 gün ekleyip yazdiriniz.
        LocalDate bugunkuTarih=LocalDate.now();
        System.out.println("bugunku Tarih = " + bugunkuTarih);
        LocalDate ikiYilIkiAyIkiGunSonra=LocalDate.now().plusYears(2).plusMonths(2).plusDays(2);
        System.out.println("iki Yil Iki AyI ki Gun Sonra = " + ikiYilIkiAyIkiGunSonra);

        // Question 17
// LocalTime
// Saati yaziniz. Sonra saate 4 saat, 3 dakika, 3 saniye ekleyiniz.
// Türkiye'nin saatini yaziniz.

        LocalTime suankiSaat=LocalTime.now();
        System.out.println("suanki Saat = " + suankiSaat);
        LocalTime dortSaatUcDakikaUcSaniye=LocalTime.now().plusHours(4).plusMinutes(3).plusSeconds(3);
        System.out.println("dort Saat Uc Dakika Uc Saniye = " + dortSaatUcDakikaUcSaniye);

        // Question 18
// LocalDateTime
//Bugünün tarihini ve saatini yaziniz.
        LocalDateTime bugununTarihiVeSaati=LocalDateTime.now();
        System.out.println("bugunun Tarihi Ve Saati = " + bugununTarihiVeSaati);

        // Question 19
// DateTimeFormatter
// M = Month   m=minutes   MMM=first 3 character   MM=2 character of month
// M=1 character Month   MMM=Full Name of Month
// hh= am/pm    HH=24 format
// Tarihi söyle yazdiriniz: 31/10/2022

      
        LocalDate tarih = LocalDate.of(2022,10,31);
        System.out.println(tarih);

        DateTimeFormatter yeniVersiyon = DateTimeFormatter.ofPattern("dd/M/yyyy");
        String tarih1 = yeniVersiyon.format(tarih);
        System.out.println("tarih1 = " + tarih1);




    }
}

