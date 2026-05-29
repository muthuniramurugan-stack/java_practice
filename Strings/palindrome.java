package Strings;

public class palindrome {
    public static void main(String[] args) {
        String name = "MOM";
        String temp = name;
        String rev = "";
        for (int i = temp.length() - 1; i >= 0; i++) {
            rev += temp.charAt(i);
        }
        if (name == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not A Palindrome");
        }
    }
}
