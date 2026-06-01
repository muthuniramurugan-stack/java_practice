package Strings;

public class countdigits {
    public static void main(String[] args) {
        String name = "muthu272006";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch > '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}
