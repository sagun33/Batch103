package day02methodcreation;

public class Car {

    public int fiyat = 20000;

    public static void main(String[] args) {
        /*
        Obje nasil olusturulur
        1) Class ismini olustururuz
        2)Objeye bir isim veririz
        3)= Assignment
        4)new keywordunü kullan
        5)Class ismini parantezle birlikte yazariz

NOT:ilk Class olusturmayi ögrendik===>Variable ===>Object
                                      Method

         */


        Car myHonda=new Car();
        System.out.println(myHonda.fiyat);
        myHonda.marka();

        myHonda.dur();

        // MethodCreation classindan object olusturduk.
        MethodCreation obj=new MethodCreation();
        System.out.println(obj.toplamaYap(2,5));
        System.out.println(obj.ucSayiyiCarp(5,5,5));
        System.out.println(obj.ucSayidanIkisniToplaUcuncusuyleCarp(5,5,5));





    }

    public  void marka(){
        System.out.println("BMW");
    }
    public   void  dur(){
        System.out.println("Honda guvenli durur....");
    }




    }

