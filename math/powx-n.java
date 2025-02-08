class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        if (n == 0 || x == 1){
            return result;
         }

        if (n == Integer.MIN_VALUE) {
            return myPow(x * x, n / 2);
        }


        if (n < 0){
            return 1/myPow(x, -n);
        }

        while (n > 0) {
            if ((n & 1) == 1) {
                result *= x;
            }
            x *= x;
            n >>= 1;
        }

        return result;
    }
}