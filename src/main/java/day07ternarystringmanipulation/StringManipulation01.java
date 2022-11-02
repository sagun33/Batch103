package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {
                         /*String Class Methodlari

        1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                    ii)equals() method'u "boolean" return eder.

        2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                              ii) equalsIgnoreCase() method'u "boolean" return eder.

        3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                         ii) toLowerCase() method'u "String" return eder

        4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                         ii) toUpperCase() method'u "String" return eder

        5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                    ii) charAt() method'u "char" return eder.

        6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                   ii) length() method'u "int" return eder.

        7)contains(): i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                      ii) contains() method'u "boolean" return eder.

        8)split():  i)Bir String'i istedigimiz character'den parcalamaya yarar
                    ii)split() method'u "Array" return eder.

                          */
        /* Bir password' un gecerli olup olmadigini asagidaki kurallara göre kontrol eden kodu yaziniz.
        i)En az 8 character icermeli
        i)Space characteri icermemeli
        iii)ilk harfi M veya m olmali
        iv)son characteri ? olmali


         */
        

        


        String pwd ="Manisa12";
        //i)En az 8 charakter icermeli
         boolean first =pwd.length()>7;
        //ii)Space characteri icermemeli
        boolean second=!pwd.contains(" ");

        //iii)ilk harfi M veya m olmali
        boolean third=pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //iv)son characteri ? olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';
        System.out.println(first||second||third||fourth);






        
    }

}
