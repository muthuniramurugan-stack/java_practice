package Strings;

public class capitalizefirst {
    public static void main(String[] args) {
        String name = "hi how are you";
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (i == 0 || name.charAt(i - 1) == ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) -32;
                }
            }
            result += ch;
        }
        System.out.println(result);
    }
}
