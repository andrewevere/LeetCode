class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0, sum = 0, ave = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (i < k - 1){
                continue;
            }
            ave = sum / k;
            if (ave >= threshold){
                ans ++;
            }
            sum -= arr[i - k + 1];
        }
        return ans;
    }
}