public class StringTest {
    String str = "Programming";

    public void main() {

        // str = str.replace("g","s");

        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("amms"));
        System.out.println(str.substring(0, 4));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.startsWith("P"));
        char arr[]=str.toCharArray();
        for(char ch : arr){
            System.out.println(ch);
        }
        System.out.println(arr);
        System.out.println(str);
    }
}
