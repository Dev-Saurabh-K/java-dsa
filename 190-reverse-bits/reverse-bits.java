class Solution {
    public int reverseBits(int n) {
        int[] reversed_binary = new int[32];
        int reversed_number = 0;

        for(int i=0; i<32; i++){
            reversed_binary[i]=n%2;
            n = n/2;
        }
        for(int i=0; i<32; i++){
            reversed_number = (int)Math.pow(2,31-i)*reversed_binary[i] + reversed_number;
        }
        return reversed_number;
    }
}