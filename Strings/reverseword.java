package Strings;

public class reverseword {
    public static void main(String[] args) {
        String name = "Hi How Are You";
        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result += name.charAt(i);
        }
        System.out.println(result);
    }
}
