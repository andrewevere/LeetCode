class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        long n = nums.length;

        for (int i = 0; i < n; i++){
            int element = nums[i] - i;
            cnt.put(element, cnt.getOrDefault(element, 0) + 1);
        }

        long total = n * (n - 1) / 2;
        long sum = 0;

        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()){
            long value = entry.getValue();
            long len = value * (value - 1) / 2;
            sum += len;             
        }

        return total - sum;
    }
}