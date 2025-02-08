class Solution {
    private HashSet<Integer> numAppeared = new HashSet<>();
    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }else if(numAppeared.contains(n)){
            return false;
        }

        numAppeared.add(n);

        int nextNum = 0;

        while (n > 0){
            int digit = n % 10;
            nextNum += digit * digit;
            n /= 10;
        }

        return isHappy(nextNum);
    }
}