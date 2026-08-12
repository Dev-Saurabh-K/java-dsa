class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean haveVowel = false;
        boolean haveConsonant = false;
        word = word.toLowerCase();
        
        for(int i=0; i<word.length(); i++){
            if(Character.isLetter(word.charAt(i))){
                if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                    haveVowel = true;
                }else haveConsonant = true;
            }
            if(Character.isLetterOrDigit(word.charAt(i))==false){
                return false;
            }
            // else return true;
        }
        return haveVowel && haveConsonant;
    }
}