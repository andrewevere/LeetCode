class Solution {
    public int removeElement(int[] nums, int val) {
        int slowint = 0;
        int size = nums.length;

        for (int fastint = 0; fastint < size; fastint ++){
            if (val != nums[fastint]){
                nums[slowint++] = nums[fastint];
            }
        }
        return slowint;
    }
}