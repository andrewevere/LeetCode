class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0;
        int nosatisfied = 0; 
        int sum = 0;
        int n = customers.length;

        for (int i = 0; i < n; i++){
            if (grumpy[i] == 0){
                sum += customers[i];
            }
        }
        for (int i = 0; i < n; i++){
            if (grumpy[i] == 1){
                nosatisfied += customers[i];
            }
            if (i < minutes - 1){
                continue;
            }
            ans = Math.max(ans, nosatisfied);
            int out = grumpy[i - minutes + 1];
            if (out == 1){
                nosatisfied -= customers[i - minutes + 1];
            }
        }
        return ans + sum;
    }
}