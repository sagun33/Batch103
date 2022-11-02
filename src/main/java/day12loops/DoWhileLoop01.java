package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while-loop icin loop body'si icindeki kodun hic calistirilmama ihtimali vardir.
        //zero execution mumkundur
        int i = 1;
        while(i<1){
            System.out.println("While loop");
            i++;
        }
        //do-while loop'un body'si icindeki kod her halikarda en az bir kere calisir
        //zero execution mumkun degildir
        int k = 1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);

        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //           24.5673 ==> 5+6+7+3 = 21
        double num = 24.5673;
        System.out.println(num);//24.5673

        //String.valueOf() methodu parantezin icine konulan data nin tipine String yapar
        String str = String.valueOf(num);
        System.out.println(str);//24.5673

        //Regex icin nokta kullandiginizda onune "\\" koyunuz. Yani nokta "\\." seklinde kullanilir
        String decimalPart = str.split("\\.")[1];


        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;

        do{

            sum = sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while(decimalInt>0);

        System.out.println(sum);



    }

}