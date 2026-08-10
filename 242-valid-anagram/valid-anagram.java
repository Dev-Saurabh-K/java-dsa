class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
    int[] character_counter = new int[26];
    for(int i=0; i<s.length(); i++){
        character_counter[s.charAt(i)-'a']++;
        character_counter[t.charAt(i)-'a']--;
    }
    for(int count: character_counter){
        if(count != 0){
            return false;
        }
    }
    return true;
    }
}