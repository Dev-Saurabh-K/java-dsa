class Solution {
    HashMap<Integer, Integer> memory = new HashMap<>();
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        if(memory.containsKey(n)){
            return memory.get(n);
        }
        int result = climbStairs(n-1)+climbStairs(n-2);
        memory.put(n,result);
        return result;
    }
}