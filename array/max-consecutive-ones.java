class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int[] number = new int[nums.length];
        int firstOne = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                firstOne = i;
                break;
            }
        }

        for (int i = firstOne; i < nums.length; i ++){
            consecutive ++;

            if (nums[i] == 0){
                number[i] = consecutive - 1;
                consecutive = 0;
            }

            if (i == nums.length - 1 && nums[i]!= 0){
                number[i] = consecutive;
                consecutive = 0;
            }
        }

        int max = 0;
        for (int i = 0; i < number.length; i++){
            if (number[i] > max)
                max = number[i];
        }

        return max;
    }
}