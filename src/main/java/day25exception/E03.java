package day25exception;

public class E03 {

    public static void main(String[] args) {
        String str = "Ali";

        getNumOfChars(str);//3

        String s = "";
        getNumOfChars(s);//0

        String t = null;
        getNumOfChars(t);//NullPointerException
        //eger length() methodunda null kullanırsanız bu exception ı alirsiniz

    }

    //Bir  String te bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz
    public static void getNumOfChars(String str){

        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("length() methodunda bir problem olustu ");

            e.printStackTrace();
            //bu methodu kullandiginiz zaman System.out.println(); kullanmaniza gerek yok
        }


    }

}