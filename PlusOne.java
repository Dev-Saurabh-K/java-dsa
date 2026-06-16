public class PlusOne {
    public static void main(String[] args) {
        int digits[] = { 1 };
        PlusOne po = new PlusOne();

        // po.plusOne(digits);

        int arr[]=po.plusOne(digits);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public int[] plusOne(int[] digits) {
        // int lastindex = digits.length-1;
        
        // digits[lastindex] = digits[lastindex] + 1;
        // int newDigits[] = new int[lastindex + 2];
        
        // int j=0;

        // for (int i = 0; i <= lastindex; i++) {
        //     if (digits[i] > 9 ) {
        //         int rightpart = digits[i] % 10;
        //         int leftpart = digits[i] / 10;
                
        //         newDigits[i] = leftpart;
        //         newDigits[i+1] = rightpart;
        //         j++;
        //     }
        //     else{
        //         newDigits[j] = digits[i];
        //     }
        //     j++;
        // }
        // // System.out.println(newDigits[lastindex]);
        // // System.out.println(newDigits[lastindex+1]);
        
        // // System.out.println(digits[lastindex]);
        // // if(newDigits[lastindex]!=1 ){

        // //     System.out.println(newDigits[lastindex]);
        // //     return digits;
        // // }
        
        // // return newDigits;
        // if(digits[lastindex]==10){
        //     return newDigits;
        // }
        // else{
        //     return digits;
        // }

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
        digits = new int [digits.length+1];
        digits[0]=1;
        return digits;
    }
}
