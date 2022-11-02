package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        //Verilen yilin "Leap Year"(Artik yil) olup olmadigini  kontrol eden kodu yaziniz.
        //1:Yil 100 e bölünürse 400 ede bolunmelidir
        //2_Yil 100 e blunmezse 4 e bolunmelidir
        //HappySenario(Leap year oldugu icin)
        int year = 2001;//sart1  ? ( sayrt2   ? dogru  : yanlis   ):( sart3   ? dogru   : yanlis   )
        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Leap year degil") : (year % 4 == 0 ? "Leap year" : "Leap year degil");
        System.out.println("leap = " + leap);

        //Exam1:Asagidaki kurallara göre password'un gecerli olup olmadigini kontrol eden kodu yaziniz.
        //1.kural:Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i ' olmalidir
        //2.kural:Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.

        String pwd = "K2a398";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length() < 8 ? (ilkHarf == 'K' ? "Gecerli" : "Gecersiz") : (ilkHarf == 'i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);
        //Example:


    }
}
