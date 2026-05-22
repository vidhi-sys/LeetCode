class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        // handle negative power
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {
            // if odd power
            if ((N & 1) == 1) {
                ans *= x;
            }

            x *= x;
            N /= 2;
        }

        return ans;
    }
}