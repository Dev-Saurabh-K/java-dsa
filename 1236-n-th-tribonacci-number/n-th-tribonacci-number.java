class Solution {
    int[] memory;
    public int tribonacci(int n) {
        if(memory==null){
            memory=new int[n+1];
            Arrays.fill(memory, -1);
        }
        if(n==0){
            return n;
        }else if(n==1 || n==2){
            return 1;
        }
        if (memory[n] != -1){
            return memory[n];
        }
        memory[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return memory[n];
    }
}