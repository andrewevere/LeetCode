class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        int currentSum = 0;
        int n = cardPoints.length;
        int total_pts = 0;

        for (int i = 0; i < n; i++){
            total_pts += cardPoints[i];
        }

        if (n == k){
            return total_pts;
        }

        for (int i = 0; i < n; i++){
            currentSum += cardPoints[i];
            if (i < n - k - 1){
                continue;
            }
            ans = Math.max(ans, total_pts - currentSum);
            currentSum -= cardPoints[i - (n - k) + 1];
        }
        return ans;
    }
}