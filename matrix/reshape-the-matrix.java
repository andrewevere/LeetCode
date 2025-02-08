class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int totalElement = 0;
        for (int[] subarray : mat)
            totalElement += subarray.length;

        if (totalElement != r * c)
            return mat;
        
        int[] arr = new int[totalElement];
        int[][] newArray = new int[r][c];
        int index = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                arr[index] = mat[i][j];
                index ++;
            }
        }

        index = 0;

        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                newArray[i][j] = arr[index];
                index ++;
            }
        }

        return newArray;
    }
}