package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

        //Post Increment

        int a=5;
        int b= a++;
        System.out.println(b); //5
        System.out.println(a);//6

        //Pre Increment

        int c=10;
        int d=++c;

        System.out.println(d);//11
        System.out.println(c);//11

        //Post Decrement

        int e =20;
        int f =e--;

        System.out.println(f);//20
        System.out.println(e);//19

        //Pre Decrement

        int g =56;
        int h =--g;

        System.out.println(h); // 55
        System.out.println(g); // 55





    }
}

