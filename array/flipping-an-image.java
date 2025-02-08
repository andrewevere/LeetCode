class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int j = 0, k = image[i].length - 1; 
            while (j <= k) {
                int tmp = image[i][j]; 
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = tmp ^ 1;
                j++; 
                k--; 
            }
        }
        return image; 
    }
}