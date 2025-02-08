class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
       		if (s.length() <= 1) {
        return s.length();
    }
		
		char[] l = s.toCharArray();
		int ans = 0;
		int cnt = 0;
		int left = 0;
			for (int right = 1; right < l.length; right++) {
				if (l[right] == l[right - 1]) {
					cnt++;
				}
				while (cnt > 1) { // same == 2
                // 左指针右移，缩小窗口
					left++;
				 // 如果左指针位置的字符和它的下一个字符相同，减少 cnt
					if (l[left] == l[left - 1]) {
						cnt--;
					}
				}
				ans = Math.max(ans, right - left + 1);
			}
		return ans;
    }
}