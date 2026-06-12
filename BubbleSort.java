
public class BubbleSort {

    boolean switc = true;
    int nums[] = { 9, 6, 9, 7, 2, 5, 4 };
    int z = nums.length - 1;
    // int z = 20;
    int a = 0;

    public void iterate() {
        int temp = 0;
        a++;
        System.out.println("before");

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");

            if (nums[i] > nums[i + 1]) {
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        System.out.println("after");
        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");
        }
    }

    public void main(String[] args) {
        // iterate();

        // obj.iterate();
        while (switc) {
            iterate();
            if (a == z) {
                break;
            }
        }
    }

}