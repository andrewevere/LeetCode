class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0, sum = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (i < k - 1) {
                continue;
            }
            if (map.size() == k) {
                ans = Math.max(ans, sum);
            }
            sum -= nums[i - k + 1];
            map.put(nums[i - k + 1],map.get(nums[i - k + 1]) - 1);
            if(map.get(nums[i - k + 1]) == 0){
                map.remove(nums[i - k + 1]);
            }
        }
        return ans;
    }
}