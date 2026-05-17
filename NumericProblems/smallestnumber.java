public class smallestnumber {
    public static void main(String[] args) {
        int smallest = 9;
        int num = 12347;
        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num /= 10;
        }
        System.out.println("The smallest digit in a number is:" + smallest);
    }
}
