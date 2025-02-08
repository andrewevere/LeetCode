class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int output = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i+1] - 1)
                output = nums[i] + 1;
        }
        if (nums[nums.length-1] != nums.length){
                output = nums.length;
        }
        return output;
    }
}