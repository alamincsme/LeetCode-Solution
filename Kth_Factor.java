package leetCode;

import java.util.Set;
import java.util.TreeSet;

public class Kth_Factor {
    public int kthFactor(int n, int k) {
         int cnt = 0;
        Set<Integer> factors = new TreeSet<>( );
        int sqrt_n = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt_n; i++) {
            if (n % i == 0) {
                factors.add(i);
                factors.add( n / i );
            }
        }

        int r ;
        for (int x : factors ) {
            cnt  += 1;
            if (cnt == k) {
                r = x ;
            }
        }
        if (r != 0 ) {
            return  r;
        } else {
            return  -1 ;
        }

    }
}
