class Solution {
    public int reverse(int x) {
        double y=x;
        // int reversed = 0;
        double reversed = 0;

        if(y>=2147483647.0 || y<=-2147483648.0) return 0;
        while(x!=0){
            reversed = reversed*10 + x%10;
            x = x/10;
        }
        if(reversed>=2147483647.0 || reversed<=-2147483648.0) return 0;
        return (int)reversed;
    }
}