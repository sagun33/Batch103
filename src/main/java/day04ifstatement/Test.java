package day04ifstatement;

public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.myMethod('A', 'b'));

        System.out.println(obj.toplama(3,6));
        System.out.println(obj.cikarma(10,5));
        obj.salih();

    }
    public int myMethod(char c1, char c2){
        return c1 + c2;
    }

    public int toplama(int a,int b){
        return a+b;
    }

    public int cikarma(int c,int d){
        return c-d;
    }
    public void salih (){
        System.out.println("QA ");

    }
}
