package Question_Answer;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


        //Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20, 10000 ve 10000'den cok ise %10 zam yapiniz.
        List<Double> salary = new java.util.ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        for (Double w : salary) {
            if (w > 0 && w < 10000) {
                salary.set(salary.indexOf(w), w + w * 0.20);
            } else if (w >= 10000) {
                salary.set(salary.indexOf(w), w + w * 0.10);


            }
        }
        System.out.println(salary);

    }
}
