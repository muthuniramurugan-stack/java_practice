public class increasingdigit {
    public static void main(String[] args) {
        int num = 12345;
        int prev = 10;
        boolean increasing = true;
        while (num > 0) {
            int digit = num % 10;
            if (digit >= prev) {
                increasing = false;
                break;
            }
            prev = digit;
            num /= 10;
        }
        if (increasing) {
            System.out.println("IncreasingDigit");
        } else {
            System.out.println("Not an IncreasingDigit");
        }
    }
}
