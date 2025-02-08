class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        int cnt = 0;
        int[] num = new int[2];

        for(int i = 0; i < char1.length; i++){
            if(char1[i] != char2[i]){
                if (cnt == 2){
                    return false;
                }
                num[cnt++] = i;
            }
        }
        if(cnt % 2 == 1){
            return false;
        }

        int i1 = num[0], i2 = num[1];
        return char1[i1] == char2[i2] && char1[i2] == char2[i1];
    }
}