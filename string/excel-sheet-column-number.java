class Solution {
    public int titleToNumber(String columnTitle) {
        int output = 0;

        for (int i = 0; i < columnTitle.length(); i++){
            int letter = columnTitle.charAt(i) - 'A' + 1;
            output += letter * Math.pow(26, columnTitle.length() - 1 - i);
        }

        return output;
    }
}