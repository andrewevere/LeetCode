class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right){
            int middle = left + (right - left) / 2;
            if (nums[middle] > target){
                right = middle;
            } else if (nums[middle] < target){
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}