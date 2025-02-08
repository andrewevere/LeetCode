class Solution {
    public boolean isIsomorphic(String s, String t) {
        return getPattern(s).equals(getPattern(t));
    }
    
    public static String getPattern(String word){
        Map<Character, Integer> firstOccurence = new HashMap<>();
        StringBuilder pattern = new StringBuilder();

        for(int i = 0; i < word.length(); i++){
            firstOccurence.putIfAbsent(word.charAt(i), i);
            pattern.append(firstOccurence.get(word.charAt(i))+1);
        }

        return pattern.toString();
    }
}