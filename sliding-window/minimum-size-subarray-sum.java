class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int subLength = 0;
       int sum = 0;
       int i = 0;
       int result = Integer.MAX_VALUE;

       for (int j = 0; j < nums.length; j++){
        sum += nums[j];
        while (sum >= target){
            subLength = j - i + 1;
            result = result < subLength ? result : subLength;
            sum -= nums[i++];
        }
       }
       return result == Integer.MAX_VALUE ? 0 : result;
    }
}