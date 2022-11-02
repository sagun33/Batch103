package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Ekrana 5000 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin "loop" kullaniriz
        //Dort cesit "loop" vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        //  Baslangic degeri Loop hangi sart altinda calisacak Increment(Artirma) veya Decrement(Azaltma)
        for( int i = 1      ;           i<6                   ;               i++                ){
            System.out.println("Hi");
        }

        //Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=4; i<8; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=8;  i>4; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: 13 den 5 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        //Cift sayilar: 14, 12, 10, 8, ...

        //1.Yol:
        for(int i=14; i>4;  i=i-2){
            System.out.print(i+" ");//14 12 10 8 6
        }

        System.out.println();

        //2.Yol:
        for(int i=14; i>4; i--){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 6: 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=28; i<158; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 7: "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz
        String str = "Java";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
        //           "Hellooo Ali" ==> He Ai
        String s = "Hellooo Ali";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);//He Ai
            }
        }
    }
}