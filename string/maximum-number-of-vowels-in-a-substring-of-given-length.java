class Solution {
    public int maxVowels(String s, int k) {
        char[] c = s.toCharArray();
        int vowel = 0, res = 0;

        for (int i = 0; i < c.length; i++){
            if (c[i]=='a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){
                vowel++;
            }

            if (i < k - 1 && k >= 2){
                continue;
            }

            res = Math.max(res, vowel);
            char out = c[i - k + 1];
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u'){
                vowel--;
            }
        }
        return res;
    }
}