package Question_Answer;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {


    //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
//        //Note: Iki ArrayList'in esit olabilmesi icin,elemanlar esit olmali ve ayni elemanlar ayni index'te olmali
    List<Character> m = new java.util.ArrayList<>();
        m.add('c');
        m.add('y');
        m.add('z');
       //m.add('h');
    List<Character> n = new ArrayList<>();
        n.add('k');
        n.add('y');
        n.add('z');

        int counter=0;
        for (int i = 0; i < m.size(); i++) {
            if (m.size()!=n.size()){
                System.out.println("Listler esit degildir1");
                counter++;
                break;
            } else if (m.get(i)!=n.get(i)) {
                System.out.println("Listler esit degildir2");
                counter++;
                break;

            }

        } if (counter==0){
            System.out.println("Listler esittir");
        }
}
}
