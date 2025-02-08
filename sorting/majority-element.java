class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int output = 0;

        for (int i = 0; i < nums.length; i++){
            int count = countMap.getOrDefault(nums[i], 0) + 1;
            countMap.put(nums[i], count);

            if (count > maxCount){
                maxCount = count;
                output = nums[i];
            }
        }

        return output;
    }
}