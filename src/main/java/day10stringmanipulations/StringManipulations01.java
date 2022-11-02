package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {


            String a = "Java kolaydir.";

            //startsWith("kola", 5); kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in
            // "kola" ile baslayip baslamadigini kontrol eder.
            //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
            boolean b = a.startsWith("kola", 5);
            System.out.println(b);

            //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
            //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
            String c = a.replace("a", "*");
            System.out.println(c);//J*va kolaydir.

            //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
            //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
            //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
            String d = a.concat(" Anladin mi?");
            System.out.println(d);//Java kolaydir. Anladin mi?

            String e = "    Tom Hanks     ";
            System.out.println(e);// "    Tom Hanks     "

            //trim() methodu bir String'in bas ve sonundaki "space" karakterlerini siler,
            // aradaki "space" karakterlerine dokunmaz
            String f = e.trim();
            System.out.println(f);//"Tom Hanks"

            String h = "Java";
            String i = "Java";

            //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
            //Buyuk harf e duyarlidir.
            //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
            //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
            int k = h.compareTo(i);
            System.out.println(k);

            //a.repeat(5); kodu "a" String'ini yanyana 5 kere yapistirir.
            //repeat(0); empty String retrun eder.
            //Java Document'e ulasmak icin Windows==>ctrl e basili tutun
            // Mac==>Command e basili tutun ve mouse ile method ismine tiklayin.
            String n = a.repeat(5);
            System.out.println(n);
    }
}