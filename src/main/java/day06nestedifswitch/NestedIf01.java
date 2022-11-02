package day06nestedifswitch;

public class NestedIf01 { //Nested :icice girmis demek.Zigon sehpa gibi.
    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyuk harf ise 'A' olursa gecerli password aksi halde gecersiz pasword.
        Paswor'un ilk harfi kucuk harf ise 'z' olursa gecerli password aksi halde gecersiz pasword.

        Nested, if'in icine if sokma islemidir.
        //Java Nested Kodlari calistirirken cok zaman harcar.Buna Time Complexity denir.
        Mümkünse Nested cod yazmamaya calismaliyiz
      */


        String pwd = "4xy12!";
        char ilkHarf =pwd.charAt(0);
        if (ilkHarf>= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("gecersiz password");
            }
        } else {
            System.out.println("ilk karakter harf olmalidir");


        }
    }
}