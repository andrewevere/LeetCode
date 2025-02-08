class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0)
        return list;
        
        int start = nums[0];
        int end = 0;

        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i + 1] != nums[i] + 1){
                end = nums[i];
                if (end == start){
                    list.add(String.valueOf(start));
                }else{
                    list.add(String.valueOf(start)+"->"+ String.valueOf(end));
                }
                start = nums[i+1];
            }
        }

        end = nums[nums.length - 1];
        if (end == start){
            list.add(String.valueOf(start));
        }else{
            list.add(String.valueOf(start)+"->"+ String.valueOf(end));
        }

        return list;
    }
}