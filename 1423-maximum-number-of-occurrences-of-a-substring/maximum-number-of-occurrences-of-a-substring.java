class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int[] letter = new int[128];
        Map<String, Integer> stringCnt = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i ++){
            letter[s.charAt(i)]++;
            if (i < minSize - 1){
                continue;
            }
            int distinctCnt = 0;
            for (int element : letter){
                if (element > 0){
                    distinctCnt ++;
                }
            }
            if (distinctCnt <= maxLetters){
                String subStr = s.substring(i - minSize + 1, i + 1);
                stringCnt.put(subStr, stringCnt.getOrDefault(subStr, 0) + 1);
            }
            Character out = s.charAt(i - minSize + 1);
            letter[out]--;
        }
        for (Map.Entry<String, Integer> entry : stringCnt.entrySet()) {
            if (entry.getValue() > ans){
                ans = entry.getValue();
            }
        }
        return ans;
    }
}