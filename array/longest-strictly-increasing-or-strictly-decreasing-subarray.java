class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incre = 1;
        int decre = 1;
        int ans = 1;

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                incre ++;
                decre = 1;
            }else if(nums[i] > nums[i+1]){
                decre ++;
                incre = 1;
            }else{
                incre = 1;
                decre = 1;
            }
            ans = Math.max(ans, Math.max(incre, decre));
        }
        return ans;
    }
}