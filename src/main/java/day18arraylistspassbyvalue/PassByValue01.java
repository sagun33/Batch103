package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
        1)Java variable'larin orginal degerlerini korumak ister
        2)Variable metodlar icinde kullanildiginda Java methodun icine orinal degeri koymaz. O degerin kopyasini üretir
          ve methoda o kopyayi yollar. Method kopya ustunde degisiklik yapar dolayısıyla variablenin orjinal degeri
          korunmus olur.Bu sisteme "Pass by Value " denir
          Note: Java Pass By Value kullanir.
          Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.Bu isi Developer'lara birakmistir.
                Bu tarz diller Pass by Referance kullanir

     */

    public static void main(String[] args) {
        int x=5;//gomlek
        System.out.println(x);//5

        //static method olan "main method"un icindeki hersey statik olmalidir.
        change(x);//Ogrenci gomlegi
//        System.out.println(x);//Gomlek


        int ucret=100;
        int copy = indirim(ucret);
        System.out.println(copy);//90

        System.out.println(ucret);//100
    }
    public static void change(int a){
        System.out.println(a*3);
    }
    //void disindaki "return" type'larda method bodysi icinde "return" keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;

    }
}