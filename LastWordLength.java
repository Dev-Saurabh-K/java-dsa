public class LastWordLength {
    public static void main(String[] args){
        String s = "hello world";
        LastWordLength wl = new LastWordLength();
        System.out.print(wl.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int lastspaceindex = s.lastIndexOf(" ");
        String lastword = s.substring(lastspaceindex+1);
        System.out.println(lastword);
        int length = lastword.length();

        return length;
    }
}
