package Question_Answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        //[21, 50, 23, 200, 18, 20, 23, 185]
        List<Integer> nums=new ArrayList<>(Arrays.asList(21, 50, 23, 200, 18, 20, 23, 185));

        for (Integer w:nums) {

            nums.set(nums.indexOf(w),w+11);

        }
        System.out.println(nums);

    }
}
