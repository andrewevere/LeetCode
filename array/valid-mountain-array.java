class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean validMountainArray = true;
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        if (index == 0 || index == arr.length - 1)
            validMountainArray = false;

        for (int i = 0; i < index - 1; i++){
            if (arr[i] > arr[i + 1] || arr[i] == arr [i + 1])
                validMountainArray = false;
        }

        for (int i = index; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1] || arr[i] == arr [i + 1])
                validMountainArray = false;
        }

        return validMountainArray;
    }
}