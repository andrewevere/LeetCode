class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (s.length() < (1 << k) + k - 1) {
            return false;
        }
       Set<String> set = new HashSet<>();
       int requiredNum = 1 << k; //2^k

       for (int i = 0; i <= s.length() - k; i++){
        String substring = s.substring(i, i + k);
        if(!set.contains(substring)){
            set.add(substring);
            if(set.size() == requiredNum){
                return true;
            }
        }
       }
       return set.size() == requiredNum;      
    }
}