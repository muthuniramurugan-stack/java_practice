package Strings;

public class removespaces {
    public static void main(String[] args) {
        String name = "Hello How Are You";
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
