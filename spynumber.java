public class spynumber {
    public static void main(String[] args) {
        int num = 1124;
        int temp = num;
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        while (temp > 0) {
            int d1 = temp % 10;
            product *= d1;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println("Spynumber");
        } else {
            System.out.println("Not A Spynumber");
        }
    }
}
