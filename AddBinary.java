public class AddBinary {
    public static void main(String[] args) {
        String a = "100110";
        String b = "11010";
        AddBinary ab = new AddBinary();
        // System.out.println(ab.addBinary(a, b));
        ab.addBinary(a, b);
    }
    public String addBinary(String a, String b) {
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        return a;
    }
}
