class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) !=' '){
                count ++;
            }else{
                count = 0;
            }
        }
        return count;
    }
}