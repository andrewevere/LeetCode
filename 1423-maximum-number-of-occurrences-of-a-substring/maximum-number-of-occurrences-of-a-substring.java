class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n = s.length();
        Map<String, Integer> freqMap = new HashMap<>();

        int[] freq = new int[128];
        int distinct = 0;

        for (int i = 0; i < minSize; i++){
            char c = s.charAt(i);
            if (freq[c] == 0){
                distinct++;
            }
            freq[c]++;
        }
        if (distinct <= maxLetters){
            String sub = s.substring(0, minSize);
            freqMap.put(sub, 1);
        }

        int ans = freqMap.getOrDefault(s.substring(0, minSize), 0);
        for (int i = minSize; i < n; i++){
            char in = s.charAt(i);
            if (freq[in] == 0){
                distinct++;
            }
            freq[in]++;

            char out = s.charAt(i - minSize);
            freq[out]--;
            if (freq[out] == 0){
                distinct--;
            }
            if (distinct <= maxLetters){
                String sub = s.substring(i - minSize + 1, i + 1);
                int count = freqMap.getOrDefault(sub, 0) + 1;
                freqMap.put(sub, count);
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}