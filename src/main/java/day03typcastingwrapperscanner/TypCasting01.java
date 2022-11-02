package day03typcastingwrapperscanner;

public class TypCasting01 {
    //Type Casting:Bir numeric data type'nin diger numeric data type'ne cevirmek demektir.
    // byte<short<int<long<float<double
    //kücükten büyüge gidise Auto Widening,Büyükten kücüge giderken Explicit Narrowing denir.
    public static void main(String[] args) {
        
        byte age = 23;
        int newAge = age;

        long population=1234;
        int newPopulation=(int) population;

        System.out.println("newAge = " + newAge);
        System.out.println("newPopulation = " + newPopulation);
        
        //Example 1:short'u double'a ceviren kodu yaziniz (Auto Widening)
        short numOfStudents =235;
        double newNumOfStudents=numOfStudents;
        //2:floati byte yapan kodu yaziniz(Explicit Marrowing)
        float price=12.99f;
        byte newPrice= (byte) price;
        System.out.println("newNumOfStudents = " + newNumOfStudents);

        System.out.println("newPrice = " + newPrice);
        //Not:Java ondalik sayiyi,tam sayiya cevirirken ondalik kismini siler.

        int number = 234567899;
        byte newNumber = (byte) number;
        System.out.println("newNumber = " + newNumber);

        int num = 510;
        byte newNum = (byte) num;

        System.out.println("newNum = " + newNum);
        
        

    }
}