class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] merged_array = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged_array[k]=nums1[i];
                i++;
            }
            else{
                merged_array[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            merged_array[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            merged_array[k]=nums2[j];
            j++;
            k++;
        }
        int m=k/2;
        double median=0.0;
        if(k%2==0){
            median = (merged_array[m]+merged_array[m-1])/2.0;
        }else{
            median = merged_array[m];
        }
        return median;
    }
}