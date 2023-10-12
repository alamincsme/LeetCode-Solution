import java.util.HashMap;
import java.util.Map;
import java.lang.Math.*;
public class majorityElement {


    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            if (!frequencyMap.containsKey(nums[i])) {
                frequencyMap.put(nums[i] , 1);
            } else {
                int old_value = frequencyMap.get(nums[i]);
                frequencyMap.put(nums[i], old_value + 1) ;
            }
        }
        int m_element = Integer.MIN_VALUE;
        int r = 0;
        for (Map.Entry<Integer , Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= m_element) {
                m_element = entry.getValue();
                r = entry.getKey();
            }
        }
       return r ;

    }

    public static void main(String[] args) {
        int [] n = {3,4,3};
       int r =  majorityElement(n);
        System.out.println(r);

    }
}
