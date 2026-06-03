package Strings;

public class reverseeachword {
    public static void main(String[] args) {
        String name = "Hi How Are You";
        String word = "";
        for (int i = 0; i <= name.length(); i++) {
            if (i == name.length() || name.charAt(i) == ' ') {
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word = "";
            } else {
                word += name.charAt(i);
            }
        }
    }
}