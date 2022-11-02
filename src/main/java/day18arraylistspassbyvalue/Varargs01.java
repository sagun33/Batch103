package day18arraylistspassbyvalue;

public class Varargs01 {
    /*

        1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.

        2)"varargs" arka tarafta "Array" kullanir. Bu yuzden varargslarla calisirken,
          Arraylerle calisiyormus gibi davranabilirsiniz.

        3)"varargs" olusturmak icin "<data type>...<varargs ismi>"

        4)Bir method'da varargsin yanında baska bir parametre varsa , varargs en sonda olmak sartıyla kullanilabilir.

        5)Bir methodda birden fazla varargs kullanilamaz.Cunku varargs en sonda olmak zorundadır.Birden fazla
          kullanildiginda en az bir varargs en sonda olmayacaktır. Bu da 4. madde ile celisir.

     */
    public static void main(String[] args) {

        int r1 = add(2, 3);
        System.out.println(r1);//5

        int r2 = add(2, 3, 4);
        System.out.println(r2);

        int r3 = add(2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(r3);//44


    }

    //iki sayinin toplamini return eden bir method olusturunuz
//    public static int add(int a,int b){
//
//        return a+b;
//    }


    //Istedigimiz kadar sayiyi toplayabilecegimiz method olusturunuz

    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }

//    public static int add(int... a1) {
//        int carp = 1;
//        for (int w : a1) {
//            carp = carp * w;
//        }
//        return carp;
//    }




}