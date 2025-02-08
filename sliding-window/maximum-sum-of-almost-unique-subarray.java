class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        Integer[] a = nums.toArray(Integer[]::new);
        long ans = 0;
        long sum = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < k - 1; i++) { // 先统计 k-1 个数
            sum += a[i];
            cnt.merge(a[i], 1, Integer::sum); // cnt[a[i]]++
        }
        for (int i = k - 1; i < nums.size(); i++) {
            sum += a[i]; // 再添加一个数就是 k 个数了
            cnt.merge(a[i], 1, Integer::sum); // cnt[a[i]]++
            if (cnt.size() >= m) {
                ans = Math.max(ans, sum);
            }

            int out = a[i - k + 1];
            sum -= out; // 下一个子数组不包含 out，移出窗口
            if (cnt.merge(out, -1, Integer::sum) == 0) { // --cnt[out] == 0
                cnt.remove(out);
            }
        }
        return ans;
    }
}