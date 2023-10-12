import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class largestNumber {
    public static String largestNumber(Integer[] nums) {

        Arrays.sort(nums, Collections.reverseOrder());
        String ans = "";
        for (int x : nums) ans += x;
        System.out.println(ans);

        return ans ;
    }


        public static void main(String[] args) {
            Integer[] arr = {4, 2, 7, 1, 9};

            // Using a custom comparator to sort the array in reverse order
//            Arrays.sort(arr, Collections.reverseOrder());

//            System.out.println(Arrays.toString(arr)); // Output: [9, 7, 4, 2, 1]
            largestNumber (arr);
        }

}

