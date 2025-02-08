import java.util.Hashtable;

class Solution {
    public int firstUniqChar(String s) {
        Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            hashtable.put(s.charAt(i), hashtable.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(hashtable.get(s.charAt(i)) == 1){
                return i; 
            }
        }
        return -1;
    }
}