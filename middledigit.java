public class middledigit {
    public static void main(String[] args) {
        int num = 12345;
        String n = num + "";
        int start = 0;
        int end = n.length() - 1;
        int mid = start + (end - start) / 2;
        System.out.println(n.charAt(mid));
    }
}
