class Solution {
    public int minOperations(int[] nums, int x) {
        int res = 0, left = 0, sumlen = 0, sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        if (sum == x){
            return nums.length;
        }

        for (int right = 0; right < nums.length; right++){
            sumlen += nums[right];
            while(sumlen > sum - x && left <= right){
                sumlen -= nums[left];
                left++;
            }
            if(sumlen == sum - x){
                res = Math.max(res, right - left + 1);
            }
        }

        if(res == 0){
            return -1;
        }else{
            res = nums.length - res;
            return res;
        }
    }
}