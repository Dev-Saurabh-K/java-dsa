class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 1;
        int max =0;
        set.add(s.charAt(start));
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max=Math.max(max,end-start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}