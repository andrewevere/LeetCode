class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        int zeroIndex = 0;
        int nonZero = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == 0){
                zeroIndex = i;
            }
            nonZero = zeroIndex;
            while (nonZero < nums.length - 1 && nums[nonZero] == 0){
                nonZero ++;
            }
            temp = nums[nonZero];
            nums[nonZero] = nums[zeroIndex];
            nums[zeroIndex] = temp;
        }
    }
}