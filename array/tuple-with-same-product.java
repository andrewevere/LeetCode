class Solution {
    public int tupleSameProduct(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        int pro = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1;j < nums.length; j++){
                pro = nums[i] * nums[j];
                map.put(pro, map.getOrDefault(pro, 0) + 1);
            }
        }
        int ans = 0;
        for (int cnt : map.values()){
            if(cnt >= 2){
                ans += 8 * cnt * (cnt - 1) / 2;
            }
        }
        return ans;
    }
}