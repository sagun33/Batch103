package Constructor;

public class Ev {
    String salon="20m2";
    String mutfak="10m2";
    String banyo= "7m2";


    public Ev(){


    }

    public static void main(String[] args) {
        Ev bizimEv=new Ev();

        System.out.println(bizimEv.mutfak);

    }
}
