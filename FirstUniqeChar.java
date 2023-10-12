import java.util.Arrays;

public class FirstUniqeChar {

    public static int firstUniqChar(String s) {

        int ans = 0 ;
        int [] char_frequencies = new int [26];
        Arrays.fill(char_frequencies, 0);
        for (char c : s.toCharArray()) {
            char_frequencies[c - 'a']++;
        }
        for (int x : char_frequencies) System.out.println(x);

        for (int i = 0 ; i < char_frequencies.length ; i ++ ) {
            if (char_frequencies[i]==1) {
                ans ++ ;
            }
        }
        return ans ;

    }

    public static void main(String[] args) {
        int r = firstUniqChar("leetcode");
        System.out.println(r);
    }
}
