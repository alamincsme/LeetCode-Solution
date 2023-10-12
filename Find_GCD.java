package leetCode;

import java.util.Arrays;

public class Find_GCD {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];

        while (max != 0) {
            int temp = max ;
            max = min % max ;
            min = temp ;
        }

        return min ;
    }
}
