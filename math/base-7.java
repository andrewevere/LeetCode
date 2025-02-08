class Solution {
    public String convertToBase7(int num) {
        int exponent;
        int large = 0;
        int output = 0;
        int abs = 1;

        if (num < 0){
            abs = -1;
            num = Math.abs(num);
        }
            
            while(num != 0){
                exponent = 0;

                while (num > Math.pow(7, exponent) || num == Math.pow(7, exponent))
                    exponent++;

                exponent = exponent - 1;

                large = (int)Math.floor(num / Math.pow(7, exponent));
                output += large * (int) Math.pow(10, exponent);
                num = (int)(num - large * Math.pow(7, exponent));
            }

            output = output * abs;
       
        return String.valueOf(output);
    }
}