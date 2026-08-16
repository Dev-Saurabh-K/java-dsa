class Solution {
    public boolean isPowerOfTwo(int n) {
        int i =0;
        while(i<=500){
            if(Math.pow(2,i)==n) return true;
            i++;
        }
        return false;
    }
}