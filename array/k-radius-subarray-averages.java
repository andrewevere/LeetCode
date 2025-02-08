class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        long sum = 0;

        Arrays.fill(avgs, -1);

        
        if (k == 0){
            return nums;
        }

        if (2* k + 1 > n){
            return avgs;
        }

        for (int i = 0; i < 2 * k + 1; i++){
            sum += nums[i];
        }
        avgs[k] = (int)(sum / (2 * k + 1));

        for(int i = k + 1; i < n - k; i++){
            sum += nums[i + k] - nums[i - k - 1];
            avgs[i] = (int)(sum / (2 * k + 1));
        }
        return avgs;
    }
}