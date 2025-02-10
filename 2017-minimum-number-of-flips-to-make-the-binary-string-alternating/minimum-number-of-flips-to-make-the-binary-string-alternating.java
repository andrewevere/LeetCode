class Solution {
    public int minFlips(String s) {
        int n = s.length();
        StringBuilder p1 = new StringBuilder(), p2 = new StringBuilder();
        //拼接两份s, 模拟任意旋转后的情况
        String s2 = s + s;
        for (int i = 0; i < 2 * n; i++){
            //对于p1, 偶数位'0', 奇数位'1'
            //对于p2, 偶数位'1', 奇数位'0'
            if (i % 2 == 0){
                p1.append('0');
                p2.append('1');
            }else{
                p1.append('1');
                p2.append('0');
            }
        }
        String pattern1 = p1.toString();
        String pattern2 = p2.toString();

        //构造前缀和数组，ps[i] 表示s2[0..i-1]与pattern1 的不同字符数总和
        int[] ps1 = new int[2 * n + 1];
        int[] ps2 = new int[2 * n + 1];
        for (int i = 0; i < 2 * n; i++){
            ps1[i + 1] = ps1[i] + (s2.charAt(i) == pattern1.charAt(i) ? 0 : 1);
            ps2[i + 1] = ps2[i] + (s2.charAt(i) == pattern2.charAt(i) ? 0 : 1);
        }

        int ans = Integer.MAX_VALUE;
        //枚举所有起点i, 敞口长度为 n
        for (int i = 0; i < n; i++){
            //在 [i, i+n) 区间内与两种模式的不同字符数量
            int diff1 = ps1[i + n] - ps1[i];
            int diff2 = ps2[i + n] - ps2[i];
            ans = Math.min(ans, Math.min(diff1, diff2));
        }
        return ans;
    }
}