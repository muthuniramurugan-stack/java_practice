package Strings;

public class countuppercase {
    public static void main(String[] args) {
        String name = "Hi How Are You";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
