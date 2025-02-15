class Solution {
    public int largestPerimeter(int[] nums) {

        int largestPeri = 0;
        int perimeter = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i ++){
            if (nums[i] + nums[i + 1] > nums[i + 2])
                perimeter = nums[i] + nums[i + 1] + nums[i + 2];
            
            if (perimeter > largestPeri)
                largestPeri = perimeter;
        }

        return largestPeri;
    }
}