import java.util.*;

public class ThirdMax {

        public static int thirdMax(int[] nums) {
            long max = Long.MIN_VALUE;
            long secondMax = Long.MIN_VALUE;
            long thirdMax = Long.MIN_VALUE;

            for (int num:nums){
                if (num> max){
                    thirdMax = secondMax;
                    secondMax = max;
                    max = num;
                } else if (num>secondMax && num<max) {
                    thirdMax = secondMax;
                    secondMax = num;
                } else if (num>thirdMax && num<secondMax) {
                    thirdMax = num;
                }
            }
            int result = (thirdMax==Long.MIN_VALUE) ? (int)max : (int)thirdMax;
            return result;
        }


    public static void main(String[] args) {
        int r = thirdMax(new int[] {5,2,2});
        System.out.println(r);
    }
}
