class Solution {
    public String minWindow(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int valid = 0, start = 0, left = 0, length = Integer.MAX_VALUE;
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < tarr.length; i++){
            need.put(tarr[i], need.getOrDefault(tarr[i], 0) + 1);
        }

        for (int right = 0; right < sarr.length; right++){
            if (need.containsKey(sarr[right])){
                window.put(sarr[right], window.getOrDefault(sarr[right], 0) + 1);
                if (window.get(sarr[right]).intValue() == need.get(sarr[right]).intValue()){
                    valid ++;
                }
            }
            while(valid == need.size()){
                if(right - left + 1< length){
                    start = left;
                    length = right - left + 1;
                }
                if (need.containsKey(sarr[left])){
                    if (window.get(sarr[left]).intValue() == need.get(sarr[left]).intValue()){
                        valid --;
                    }
                    window.put(sarr[left], window.getOrDefault(sarr[left], 0) - 1);  
                }
                left++;
            }
        }
        if (length == Integer.MAX_VALUE){
            return "";
        } else {
            return s.substring(start, start + length);
        }
    }
}