package atmturkce;

import day04ifstatement.Scanner01;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Secenekler extends Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat paraSekli = new DecimalFormat("'$'###,##0.00");
    boolean flag=true;

    HashMap<Integer,Integer>data=new HashMap<>();

    public void login(){
        do {

            data.put(12345,1234);
            data.put(23456,2345);
            data.put(34567,3456);
            data.put(45678,4567);

            try {
                System.out.println("Hesap Numaranizi giriniz");
                setHesapNumarasi(input.nextInt());
                System.out.println("Pin Numaranizi giriniz");
                setPinNumarasi(input.nextInt());
            }catch (Exception e){
                System.out.println("Yanlis Karakteree girdiniz!Lutfen sadece rakam giriniz veya cikmak icin Q ya basiniz");
                input.nextLine();
                String cikis=input.next();
                if (cikis.equalsIgnoreCase("q")){
                    flag=false;
                }
            }

            int count=0;
            for (Map.Entry<Integer,Integer>w:data.entrySet() ){
                if (w.getKey().equals(getHesapNumarasi())&& w.getValue().equals(getPinNumarasi())){
                    getHesapTipi();
                }else {
                    count++;
                }

            }
            if (count==data.size()){
                System.out.println("Yanlis hesap numarasi veya pin numarasi giriniz");
            }
        }while (flag);
    }

    public void vadesizHesapIslemSecenekleri() {

        do {


            secenekler();

            int secenek = input.nextInt();
            if (secenek== 4) {
                break;
            }
            switch (secenek) {
                case 1:
                    aktuelBakiyeyiGoruntule(getVadesizHesapBakiyesi());
                case 2:
                    paraCekmeIslemiVadesiz();
                    break;
                case 3:
                    paraYatirmaIslemiVadesiz();
                    break;
                case 4:
                    System.out.println("Yanlis secenek !Lutfen 1,2,3 seceneklerden birini giriniz");

            }
        } while (true);
        getHesapTipi();
    }

    public void vadeliHesapIslemSecenekleri() {
        do {


            secenekler();
            int secenek = input.nextInt();
            if (secenek == 4) {
                break;
            }
            switch (secenek){
                case 1:
                    aktuelBakiyeyiGoruntule( getVadeliHesapBakiyesi());
                    break;
                case 2:
                    paraCekmeIslemiVadeli();
                    break;
                case 3:
                    paraYatirmaIslemiVadeli();
                    break;
                default:
                    System.out.println("Yanlis secenek!1,2,3 seceneklerden birini seciniz");


            }
        } while (true);

getHesapTipi();

    }
    public void getHesapTipi(){
        System.out.println("Islem Yapmak istediginiz hesabi seciniz");
        System.out.println("1: Vadesiz Hesap ");
        System.out.println("2: Vadeli Hesap");
        System.out.println("3: Vadeli Hesap");
        System.out.println("4: Cikis");

        int secenek = 0;
        try {
            secenek=input.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
        switch (secenek){
            case 1:
                System.out.println("Vadesiz hesabinizdasiniz");
                vadesizHesapIslemSecenekleri();
                break;
            case 2:
                System.out.println("Vadeli Hesabinizdasiniz");
                vadeliHesapIslemSecenekleri();
                break;
            case 3:
                System.out.println("ATM Makinemizi kullandiginiz icin tesekkür ederiz");
                flag=false;
            default:
                System.out.println("Yanlis decenek!Lutfen 1,2,3, seceneklerini kullaniniz");

        }

    }

    public void secenekler() {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz");
        System.out.println("1: Bakiyenizi görebilirsiniz");
        System.out.println("2: Para Cekme");
        System.out.println("3: Para yatirma");
        System.out.println("4: Cikis");
    }

}

