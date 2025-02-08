class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = nums[0];
        int left = 0, cnt = 0;
        long ans = 0;

        for (int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        for (int right = 0; right < nums.length; right++){
            if(nums[right] == max){
                cnt++;
            }
            while (cnt == k){
                if(nums[left++] == max){
                    cnt--;
                }
            }
            ans += left;
        }
        return ans;
    }
}