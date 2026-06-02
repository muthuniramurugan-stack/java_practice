package Strings;

public class uppertolowercase {
    public static void main(String[] args) {
        String name = "MUTHU";
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}
