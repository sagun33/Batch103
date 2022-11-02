package day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
////        //Example1:Bir Stringdeki Space haric kactane karakter kullanildigini gösteren kodu yaziniz.
////        //"Ali okula gitti."
//////
//////        String str = "Ali okula gitti.";
//////        int num = str.replace(" ", "").length();//length oldugu icin int degiskenine atadik
//////
//////        System.out.println(num);
//////        //spesifik bir karakteri silmek istiyorsak replace metodunu kullaniyoruz.
//////        //Example2:
//////        //Bir Stringdeki tüm a harflerini buyuk A ya ceviriniz
//////
//////        String s = "Ankara'nin tasina gozlerimin yasina bak";
//////        String degisiklik = s.replace("a", "A");
//////        System.out.println("degisiklik = " + degisiklik);
//////
//////        //Exam3:
//////        //Bir String'deki "kara" kelimesinin yerine "*"koyunuz
//////        String t = "Kara kara dusunme Ankara";
//////        String yeniT = t.replace("kara", "*");
//////        System.out.println("yeniT = " + yeniT);
//////
//////        //Example4:
//////        //Bir String'deki tum sayilari yildiza ceviriniz
//////        String stdId= "AC202117004";
//////       String yeniStdId= stdId.replaceAll("[0-9]","*");
//////        System.out.println("yeniStdId = " + yeniStdId);
//////
//////        //Bir  grup data'yi ifade eden kod`lara "Rgex denir
//////        //"Regex" Regular expressions in kisaltilmis halidir
//////
//////        /*
//////    Bir grup data'yı ifade eden kodlara "Regex" denir.
//////    "Regex" Regular Expressions'in kısaltılmış halidir.
//////
//////    1)Tüm rakamlar ==> [0-9]
//////    2)Tüm küçük harfler ==> [a-z]
//////    3)Tüm büyük harfler ==> [A-Z]
//////    4)Tüm harfler ==> [a-zA-Z]
//////    5)Sesli hardler ==> [aeiouAEIOU]
//////    6)Space ==> [ ]
//////    7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
//////    8)Tum noktalamma isaretleri==> \\p{Punct}
////
////        // 1)Rakamlar haric tum karakterler ==>[^0-9]//
////        // 2)Kucuk harfler haric tum karakterler ==> [^a-z]
////        // 3)Buyuk harfler haric tum karakterler ==> [^A-Z]
////        // 4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
////        // 5)space haric ==>[^]
////
//////
////// */
//////
//////        ////Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//////        ////           tum karakterlerin sayisini bulan kodu yaziniz
//////
////        String u = "Ali 13 yasinda, dersem inanma!...";
////
////        int yeniU = u.replaceAll("[0-9]", "").replace(" ", "").replaceAll("\\p{Punct}", "").length();
////
////        System.out.println("yeniU = " + yeniU);
////
////        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//////           i)Space haric en az sekiz karakter olmali
//////           ii)En az 1 sembol icermeli
//////           iii)En az 1 rakam icermeli
//////           iv)En az 1 buyuk harf icermeli
//////           v)En az 1 kucuk harf icermeli
////
//        String pwd = "B78c? K!m";
//        //i)Space haric en az sekiz karakter olmali
//        boolean first = pwd.replace(" ", "").length() > 7;
//        //En az 1 sembol icermeli
//        boolean second = pwd.replaceAll("[0-9a-zA-Z]", "").length() > 0;
//        //En az 1 rakam icermeli
//        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;
//        //En az 1 buyuk harf icermeli
//        boolean fourth = pwd.replaceAll("[^A-Z]", "").length() > 0;
//        //En az 1 kucuk harf icermeli
//        boolean fifth = pwd.replaceAll("[^a-z]", "").length() > 0;
//
//        boolean pwdGecerli = first && second && third && fourth && fifth;
//
//        if (pwdGecerli) {
//            System.out.println("Passwor'unuz gecerlidir...");
//
//        } else {
//            System.out.println("Passwor'unuz gecerli degildir..");



       /*Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali*/

//        String passw = "asdfghj";
//
//        boolean first = passw.length() > 7;
//        boolean second = !passw.contains("[" "]");
////      boolean third = passw.contains("[^A-Z]");
////      boolean fourth = passw.lastIndexOf(passw.length() - 1) == '.';
//        System.out.println("first = " + first);
//        System.out.println("second = " + second);
//
//        boolean gecerli = first && second ;
//
//        if (gecerli) {
//            System.out.println("Passwordunuz gecerlidir");
//
//
//        } else {
//            System.out.println("Passwordunuz gecersizdir");


//            //Exam 7:bir String'deki noktalama isaretlerinin  sayini gösteren kodu yaziniz.
//            String cumle = "Sen yapmazsan,ben!!! ben ne yaparim ...";
//
//            int number =cumle.replaceAll("[^\\p{Punct}]","").length();
//            System.out.println("number = " + number);
//
//            //Example 8:Verilen bir string "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin.
//        // aksi halde "Normal" yazdirin
//
//        String v = "Alex";
//        boolean baslangic =v.startsWith("Al");
//        boolean bitis = v.endsWith("x");
//        String result = baslangic&&bitis ? "Harika" : "Normal";
//        System.out.println("result = " + result);
//        }


        }
    }


