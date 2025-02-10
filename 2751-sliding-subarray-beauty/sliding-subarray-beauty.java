class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101];
        int offset = 50;
        int idx = 0;

        for (int i = 0; i < n; i++){
        // 添加新元素到窗口内，映射到频率数组下标
        freq[nums[i] + offset]++;
        
        // 当窗口满 k
        if(i >= k - 1){
            int count = 0;
            int beauty = 0;
            // 只考虑负数部分，下标范围 0 到 offset-1 表示 -50 到 -1
            for (int j = 0; j < offset; j++){
                count += freq[j];
                if(count >= x) {
                    beauty = j - offset; // j-offset即为实际数字
                    break;
                }
            }
            // 如果没有找到累计达到 x，说明窗口内负数数量不足，则 beauty=0
            ans[idx++] = beauty;
            
            // 移除窗口左侧元素
            freq[nums[i - k + 1] + offset]--;
        }
    }

    return ans;
    }
}