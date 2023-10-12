import java.util.HashMap;
import java.util.Map;

public class SingleNumber_2 {
    public static void main(String[] args) {
        int [] nums = {1,2 ,3, 1, 4, 5 , 6 , 8 , 8, 8} ;
        int value = singleNumber(nums);
        System.out.println(value);
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> num_frequencies = new HashMap<>();

        if (nums.length == 1 && nums[0] == 1) {
            return nums[0] ;
        }

        for (int i = 0; i < nums.length; i++) {
            if (! num_frequencies.containsKey(nums[i])) {
                if (nums[i] == 1) {
                    continue;
                }
                num_frequencies.put(nums[i], 1);
            } else {
                num_frequencies.put(nums[i] , num_frequencies.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : num_frequencies.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                return key;
            }
        }
        return - 1;
    }


}
