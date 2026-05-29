package Strings;

public class reverse {
    public static void main(String[] args) {
        String name = "Muthu";
        String rev = "";
        for (int i=name.length()-1;i>=0;i--) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}
