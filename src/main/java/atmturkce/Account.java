package atmturkce;
import java.text.DecimalFormat;
import java.util.Scanner;
public  class Account {
    private int hesapNumarasi;// hesap numarasi
    private int pinNumarasi;//sifre
    private double vadesizHesapBakiyesi; // vadesiz hesap bakiyesi
    private double vadeliHesapBakiyesi; //vadeli hesap bakiyesi

    DecimalFormat paraSekli = new DecimalFormat("'$'###,##0.00");
    Scanner input = new Scanner(System.in);

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public void setHesapNumarasi(int hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }

    public int getPinNumarasi() {
        return pinNumarasi;
    }

    public void setPinNumarasi(int pinNumarasi) {
        this.pinNumarasi = pinNumarasi;
    }

    public double getVadesizHesapBakiyesi() {
        return vadesizHesapBakiyesi;
    }

    public void setVadesizHesapBakiyesi(double vadesizHesapBakiyesi) {
        this.vadesizHesapBakiyesi = vadesizHesapBakiyesi;
    }

    public double getVadeliHesapBakiyesi() {
        return vadeliHesapBakiyesi;
    }

    public void setVadeliHesapBakiyesi(double vadeliHesapBakiyesi) {
        this.vadeliHesapBakiyesi = vadeliHesapBakiyesi;
    }

    public DecimalFormat getParaSekli() {
        return paraSekli;
    }

    public void setParaSekli(DecimalFormat paraSekli) {
        this.paraSekli = paraSekli;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    private double paraCekmeIslemindenSonraKalanMiktarVadesiz(double miktar){

    vadesizHesapBakiyesi=vadesizHesapBakiyesi-miktar;
        return vadesizHesapBakiyesi;
    }
    private double paraYatirmaIslemindenSonraOlusanMiktarVadesiz(double miktar){
        vadesizHesapBakiyesi=vadesizHesapBakiyesi+miktar;
        return vadesizHesapBakiyesi;
    }
    private double paraCekmeIslemindenSonraKalanMiktarVadeli(double miktar){
        vadeliHesapBakiyesi=vadeliHesapBakiyesi-miktar;
        return vadeliHesapBakiyesi;
    }
    private double paraYatirmaIslemindenSonraOlusanMiktarVadeli(double miktar){
        vadeliHesapBakiyesi=vadeliHesapBakiyesi+miktar;
        return vadeliHesapBakiyesi;
    }
    public void aktuelBakiyeyiGoruntule(double bakiye){
        System.out.println("Hesabinizdaki Miktar: "+paraSekli.format(bakiye));
    }

    public void paraCekmeIslemiVadesiz(){
        aktuelBakiyeyiGoruntule(vadesizHesapBakiyesi);
        System.out.println("Cekmek istediginiz mitktari giriniz");
        double miktar=input.nextDouble();


        if (miktar<=0){
            System.out.println("sifir veya eksi rakamlar gecersizdir");
            paraCekmeIslemiVadesiz();
        } else if (miktar<=vadesizHesapBakiyesi) {
            paraCekmeIslemindenSonraKalanMiktarVadesiz(miktar);
        }else System.out.println("Yetersiz Bakiye");
        System.out.println();
        aktuelBakiyeyiGoruntule(vadesizHesapBakiyesi);
    }
    public void paraYatirmaIslemiVadesiz(){
        aktuelBakiyeyiGoruntule(vadesizHesapBakiyesi);
        System.out.println("Yatirmak istediginiz Miktari giriniz");
        double miktar=input.nextDouble();
        if (miktar<=0){
            System.out.println("sifir ve eksi rakamlar gecersizdir");
            paraYatirmaIslemiVadesiz();
        }else{
            paraYatirmaIslemindenSonraOlusanMiktarVadesiz(miktar);
            System.out.println();
            aktuelBakiyeyiGoruntule(vadesizHesapBakiyesi);
        }

    }
    public void paraCekmeIslemiVadeli(){
        aktuelBakiyeyiGoruntule(vadeliHesapBakiyesi);
        System.out.println("Lutfen cekmek istediginiz miktari giriniz");
         double miktar=input.nextDouble();

         if (miktar<=0){
             System.out.println("sofir ve eksi rakamlar gecersizdir");
             paraCekmeIslemiVadeli();
         } else if (miktar<= vadeliHesapBakiyesi) {
             paraCekmeIslemindenSonraKalanMiktarVadeli(miktar);

         }else System.out.println("Yetersiz bakiye");
         aktuelBakiyeyiGoruntule(vadeliHesapBakiyesi);

    }
    public void paraYatirmaIslemiVadeli(){
        aktuelBakiyeyiGoruntule(vadeliHesapBakiyesi);
        System.out.println("Lutfen yatirmak istediginiz miktari giriniz");
        double miktar=input.nextDouble();
         if (miktar<=0){
             System.out.println("sifir veya eksi rakamlar gecersizdir");
             paraYatirmaIslemiVadeli();
         }else{
             paraYatirmaIslemindenSonraOlusanMiktarVadeli(miktar);
             System.out.println();
             aktuelBakiyeyiGoruntule(vadeliHesapBakiyesi);
         }
    }
}