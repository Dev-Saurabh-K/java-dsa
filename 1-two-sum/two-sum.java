class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> data  = new HashMap<>();
        int remainder = 0;
        int i=0;
        for(int num: nums){
            remainder = target-num;
            if(data.containsKey(remainder)){
                return new int[] {data.get(remainder), i};
            }
            data.put(num, i);
            i++;
        }
        return new int[] {};
    }
}