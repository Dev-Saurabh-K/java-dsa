// sum od n numbers

public class Sum {
    public static void main(String[] args) {
        int n = 9999;
        System.out.println(sum(n));
    }

    public static int sum(int n) {

        if (n > 0) {
            
            return n + sum(n - 1);
        } else {

            return 0;
        }
        
    }
}
