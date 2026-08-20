class Solution {
    public int[] resultArray(int[] nums) {
        int[] output =new int[nums.length];
        int o=0;
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int a1=0;
        int a2=0;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                arr1[a1]=nums[i];
                a1++;
            }else if(i==1){
                arr2[a2]=nums[i];
                a2++;
            }
            else{
                if(arr1[a1-1]>arr2[a2-1]){
                    arr1[a1]=nums[i];
                    a1++;
                }else{
                    arr2[a2]=nums[i];
                    a2++;
                }
            }

        }
        for(int j=0; j<a1; j++){
            output[o]=arr1[j];
            o++;
        }
        for(int k=0; k<a2; k++){
            output[o]=arr2[k];
            o++;
        }
        return output;
    }
}