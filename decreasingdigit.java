public class decreasingdigit {
    public static void main(String[] args) {
        int num = 54321;
        int prev = 0;
        boolean decreasing = true;
        while (num > 0) {
            int digit = num % 10;
            if (digit >= prev) {
                decreasing = false;
                break;
            }
            prev = digit;
            num /= 10;
        }
        if (decreasing) {
            System.out.println("Decreasing Number");
        } else {
            System.out.println("Not a DecreasingNumber");
        }
    }
}
