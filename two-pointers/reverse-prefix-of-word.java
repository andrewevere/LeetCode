class Solution {
    public String reversePrefix(String word, char ch) {
        int charIndex = word.indexOf(ch);
        char[] wordArr = word.toCharArray();
        for (int i = 0; i <= word.indexOf(ch); i++){
            if(i < charIndex){
                char temp = wordArr[charIndex];
                wordArr[charIndex] = wordArr[i];
                wordArr[i] = temp;
                charIndex--;
            }
        }
        word = new String(wordArr);
        return word;
    }
}