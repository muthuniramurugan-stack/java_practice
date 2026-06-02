//Toggle case is the process of converting every uppercase letter in a string to lowercase and every lowercase letter to uppercase.
package Strings;

public class togglecase {
    public static void main(String[] args) {
        String name = "MuThUmUrUgAn";
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}
