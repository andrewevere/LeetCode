class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] results = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;

        for (int k = nums.length - 1; k >=0; k--){
            if (nums[i] * nums[i] < nums[j] * nums[j]){
                results[k] = nums[j] * nums[j];
                j--;
            }else {
                results[k] = nums[i] * nums[i];
                i++;
            }
        }
        return results;
    }
}