
public class InsertionSort {
    public static void main(StringTest[] args) {
        int arr[] = { 5, 89, 62, 1, 2, 55, 72, 222 };
        int sorted = 1;
        int unsorted = arr.length;
        int temp = arr[0];
        // System.out.println(temp);
        for (int i = 0; i < unsorted; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                };

            };
            sorted = sorted+1;
        }
        ;
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }
    }
}

