class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] s=blocks.toCharArray();
        int ans = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < s.length; i++){
            if(s[i] == 'W'){
                count++;
            }
            if(i < k - 1){
                continue;
            }
            ans = Math.min(ans, count);
            char out = s[i - k + 1];
            if (out == 'W'){
                count--;
            }
        }
        return ans;
    }
}