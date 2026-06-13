package Strings;

public class frequency {
    public static void main(String[] args) {
        String name = "muthumurugan";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int count = 0;
            for (int j = 0; j < name.length(); j++) {
                if (ch == name.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + "=" + count);
        }
    }
}
