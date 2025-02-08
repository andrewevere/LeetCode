class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0, left = 0, cnt = 0;

        for (int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                cnt++;
            }
            while(cnt > k){
                if(nums[left] == 0){
                    cnt--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}