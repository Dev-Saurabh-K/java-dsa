
class RemoveElement {

    public static void main(String[] args) {
        int nums[] = { 2, 56, 36, 45, 86, 45, 99, 56, 33, 45, 86, 56, 25, 56, 99 };
        int val = 99;
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(nums, val));
        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]+" ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}