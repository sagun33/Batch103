package Question_Answer;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // Bir Integer ArrayList teki 7 haric tum elamanlari 2 arttiriniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w :ages) {
            if (w==7){
                continue;
            }else {
                ages.set(ages.indexOf(w),w+2);

            }

        }
        System.out.println(ages);
    }
}
