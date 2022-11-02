package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1:Bir sayinin pozitif olup olmadigini  ekrana yazdiran kodu yaziniz.

        //1.Way:

        int a=0;
//        if (a>0) {
//            System.out.println("Pozitif");
//        }else System.out.println("sifirdir");
        //2.Way:         Condition ? Condition dogru ise uygulanacak kod : Condition yanlis ise uygulanacak kod  ;
        String result  = a > 0 ? "pozitif" : "pozitif degil";
        System.out.println("result = " + result);

        //Example 2: iki sayidan kucuk olani secen kodu yaziniz.
        int b = 120;
        int c = 23;
        int min = b<c ? b : c;
        System.out.println("min = " + min);
        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //Mutlak degerle alakali iki kural var.Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        // Negatif sayilarin mutlak degeri eksi 1 ile carpilmis halleridir

          int d=-78;
          int abs = d<0 ? -1*d : d;
        System.out.println("abs = " + abs);

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz,farkli ise "islem yapamam"mesajini veriniz.
//Ternary farkli data tiplerinde return ederse sonucun data tipini Object yapiniz
        int e =-12;
        int f =10;
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f:"islem yapamam";
        System.out.println("islem = " + islem);
        //Note:Java'da her class'in en az bir tane "parent class'i vardir"
        //sadece Object class'in parent class'i yoktur



    }
}
