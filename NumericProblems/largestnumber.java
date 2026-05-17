public class largestnumber {
    public static void main(String[] args) {
        int num = 123945;
        int largest = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        }
        System.out.println("The largest digit in an number is:" + largest);
    }
}
