package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account01 {


    public  int hesapNo;
    public  int pinKodu;
    public  double vadesizHesapBakiyesi;
    Scanner input = new Scanner(System.in);
    DecimalFormat paraFormati = new DecimalFormat("'$'###,##0.00");

    public double bakiyeIlk(double miktar){
       return vadesizHesapBakiyesi=5000;
    }



    public   double hesaptanParaCektiktenSOnrakiBakiye(double miktar) {
        vadesizHesapBakiyesi = vadesizHesapBakiyesi - miktar;
        return vadesizHesapBakiyesi;

    }

    public   double hesabaParaYatirdiktanSonrakiBakiye(double miktar) {
        vadesizHesapBakiyesi = vadesizHesapBakiyesi + miktar;
        return vadesizHesapBakiyesi;
    }

    public  void bakiyeSonGorunum(double bakiye) {
        System.out.println("Hesabinizda kalan miktar: " + paraFormati.format(bakiye));
    }

    public  void paraCekmesiIcinMusteriyeBildir() {
        bakiyeSonGorunum(vadesizHesapBakiyesi);
        System.out.println("Cekmek  istediginiz miktari giriniz");
        double miktar = input.nextDouble();
        if (miktar <= 0) {
            System.out.println("Gecersiz bir miktar girdiniz");
            paraCekmesiIcinMusteriyeBildir();

        } else if (miktar <= vadesizHesapBakiyesi) {
            hesaptanParaCektiktenSOnrakiBakiye(miktar);
            bakiyeSonGorunum(vadesizHesapBakiyesi);

        } else System.out.println("Yetersiz Bakiye");
    }

    public  void musteriyeParaYatirmaBildirimleri() {

        bakiyeSonGorunum(vadesizHesapBakiyesi);
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double miktar = input.nextDouble();
        if (miktar <= 0) {
            System.out.println("gecersiz bir miktar girdiniz");
            musteriyeParaYatirmaBildirimleri();
        } else hesabaParaYatirdiktanSonrakiBakiye(vadesizHesapBakiyesi);
        bakiyeSonGorunum(vadesizHesapBakiyesi);

    }

    public double faizHesaplama(double miktar){
        double faiz= miktar*25/100;
        return faiz;
    }








}
