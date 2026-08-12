class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder word = new StringBuilder();
        int stringindex = 0;
        HashSet<Character> allowed_c = new HashSet<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'));
        for(int i=0; i<s.length(); i++){
            if(allowed_c.contains(s.charAt(i))){
                word.insert(stringindex, s.charAt(i));
                stringindex++;
            }
        }
        int length = word.length();
        // if(length == 1) return false;
        for(int i = 0; i<length; i++){
            if(word.charAt(i)!=word.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}