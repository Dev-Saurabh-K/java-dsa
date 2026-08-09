class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] merged_array = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                merged_array[k] = nums1[i];
                i++;
            } else {
                merged_array[k] = nums2[j];
                j++;
            }

            k++;
        }
        while (i < m) {
            merged_array[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            merged_array[k] = nums2[j];
            j++;
            k++;
        }
        for (int s = 0; s < m + n; s++) {
            nums1[s] = merged_array[s];
        }
    }
}