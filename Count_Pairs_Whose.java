package leetCode;

import java.util.List;

public class Count_Pairs_Whose {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target)  cnt++;
            }
        }
        return cnt;
    }
}
