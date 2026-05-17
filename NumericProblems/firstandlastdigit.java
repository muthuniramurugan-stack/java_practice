public class firstandlastdigit {
    public static void main(String[] args) {
        int num = 12345;
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first = first / 10;
        }
        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
    }
}
