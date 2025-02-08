class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ave = Double.NEGATIVE_INFINITY, sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (i >= k - 1){
                ave = Math.max(ave, sum / k);
                sum -= nums[i - k + 1];
            }
        }

        return ave;
    }
}