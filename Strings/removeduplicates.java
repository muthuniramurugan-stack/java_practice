package Strings;

public class removeduplicates {
    public static void main(String[] args) {
        String name = "muthumurugan";
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            int j;
            for (j = 0; j < i; j++) {
                if (ch == name.charAt(j)) {
                    break;
                }
            }

            if (j == i) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}