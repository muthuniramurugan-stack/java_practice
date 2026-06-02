package Strings;

public class lowertoupper {
    public static void main(String[] args) {
        String name = "muthu";
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}
