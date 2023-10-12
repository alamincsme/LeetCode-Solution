import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber_3 {

    public static void main(String[] args) {
        int [] nums = {1, 2, 1, 3, 2, 5};
        int [] a  = singleNumber(nums);
        for (int x : a) System.out.println(x);

    }
    public static int []  singleNumber(int[] nums) {

        Map<Integer, Integer> find_frequencies = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if ( !find_frequencies.containsKey(nums[i])) {
                find_frequencies.put(nums[i] , 1);
            } else {
                find_frequencies.put(nums[i], find_frequencies.get(nums[i]) + 1);
            }
        }
        List<Integer> r = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : find_frequencies.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() != 2) {
                r.add(entry.getKey());
            }
        }

       int [] ans = new int[r.size()];
        int i = 0 ;
        for (int x : r) {
            ans [i] = x;
            i++;
        }

        return ans;

    }
}
