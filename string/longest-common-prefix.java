class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String commonPre = "";

        for (int i = 0; i < strs[0].length(); i++){
            commonPre = strs[0].substring(0,i+1);

            for (int j = 1; j < strs.length; j++){
                if (i >= strs[j].length() || !commonPre.equals(strs[j].substring(0,i+1))){
                    return strs[0].substring(0, i);
                }
            }
        }
        return commonPre;
    }
}