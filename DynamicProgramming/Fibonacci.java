package DynamicProgramming;
import java.util.Arrays;
public class Fibonacci{
    static int[] dp;
    
    public static void main(String[] args) {
        int n = 45;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=(fib(n-1)+fib(n-2));
        // return (fib(n-1)+fib(n-2));
    }
}