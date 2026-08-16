class Solution {
    public int hammingWeight(int n) {
        int[] b_n = new int[100];
        for(int i=0; i<100; i++){
            b_n[i] = n%2;
            n=n/2;
        }
        int j=0;
        for(int i=0; i<100; i++){
            if(b_n[i]==1){
                j++;
            }
        }
        return j;
    }
}