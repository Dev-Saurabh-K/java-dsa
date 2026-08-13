class Solution {
    public String addBinary(String a, String b) {
        int max_size = Math.max(a.length(), b.length()) + 1;
        char[] sum = new char[max_size];
        char[] a_array = new char[max_size];
        char[] b_array = new char[max_size];

        Arrays.fill(sum, '0');
        Arrays.fill(a_array, '0');
        Arrays.fill(b_array, '0');

        int sout = 0;
        int carry = 0;
        int j = 1;

        for(int i = a.length() - 1; i >= 0; i--){
    a_array[max_size - (a.length() - i)] = a.charAt(i);
}

for(int i = b.length() - 1; i >= 0; i--){
    b_array[max_size - (b.length() - i)] = b.charAt(i);
}

        while(j < max_size){
            sout = (a_array[max_size-j] - '0') +
                   (b_array[max_size-j] - '0') +
                   carry;

            if(sout == 3){
                carry = 1;
                sout = 1;
            }
            else if(sout == 2){
                carry = 1;
                sout = 0;
            }
            else if(sout == 1){
                carry = 0;
                sout = 1;
            }
            else{
                carry = 0;
                sout = 0;
            }

            sum[max_size-j] = (char)(sout + '0');
            j++;
        }

        sum[0] = (char)(carry + '0');

        String output = new String(sum);

        if(output.charAt(0) == '0'){
            output = output.substring(1);
        }

        return output;
    }
}