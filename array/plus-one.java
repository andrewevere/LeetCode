class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    System.out.println(digits[i]);
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            // If we reach here, it means the whole number was 9s, so we need to create a new array.
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
    }
}