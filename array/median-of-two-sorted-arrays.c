double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int *nums = (int *)malloc(sizeof(int) * (nums1Size + nums2Size));
    int i = 0, j = 0, k = 0;
    while (i < nums1Size && j < nums2Size) {
        if (nums1[i] < nums2[j]) {
            nums[k++] = nums1[i++];
        } else {
            nums[k++] = nums2[j++];
        }
    }
    while (i < nums1Size) {
        nums[k++] = nums1[i++];
    }
    while (j < nums2Size) {
        nums[k++] = nums2[j++];
    }
    double res = 0;
    if ((nums1Size + nums2Size) % 2 == 0) {
        res = (nums[(nums1Size + nums2Size) / 2 - 1] + nums[(nums1Size + nums2Size) / 2]) / 2.0;
    } else {
        res = nums[(nums1Size + nums2Size) / 2];
    }
    free(nums);
    return res;
}