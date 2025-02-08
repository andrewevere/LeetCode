class Solution {
    public int minSwaps(int[] nums) {
        int k=0,count=0,MaxCount=0;
    for(int i=0;i<nums.length;i++){
        k+=nums[i];    //获取窗口的大小
    }
    //主要是循环数组，相当在数组num拼接
    for(int i=0;i<nums.length+k;i++){
        if(nums[i%nums.length]==1){    //当i超过数组的长度时，获取i的余数便是数组的首段元素
            count++;
        }
        if(i<k-1){
            continue;
        }
        MaxCount=Math.max(MaxCount,count);
        
        if(nums[(i-k+1)%nums.length]==1){
            count--;
        }
    }
    return k-MaxCount;
    }
}