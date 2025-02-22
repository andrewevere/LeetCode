class Solution {
    public boolean isPalindrome(String s) {
        // declare left and right pointers
        int l  = 0, r = s.length() - 1;
        // iterate until pointers meet in the middle
        while(l < r) {
            // take chr at left pointer and make it lower case
            char lc = Character.toLowerCase(s.charAt(l));
            // take char at right pointer and make it lower case
            char rc = Character.toLowerCase(s.charAt(r));
            // check if left char is special symbol
            if(!Character.isLetterOrDigit(lc)) {
                // if true increment left pointer
                l++;
            // check if right char is special symbol
            } else if(!Character.isLetterOrDigit(rc)) {
                // decrement right pointer if true
                r--;
            } else {
                // if both chars are letters or digits check for equality, if false return false since this string is not palindrome
                if(lc != rc) return false;
                // increment left pointer
                l++;
                // decrement right pointer
                r--;
            }
        }
        // return true means string is a palindrome
        return true;
    }
}