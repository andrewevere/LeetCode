class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if (isPalindrom(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public boolean isPalindrom(String s){
        int l = 0, r = s.length() - 1;

         while (l < r){
                char lc = s.charAt(l);
                char rc = s.charAt(r);

                if (lc != rc){
                    return false;
                }

                l++;
                r--;
            }
        return true;
    }
}