public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int arm = 0;
        while (num > 0) {
            int digit = num % 10;
            arm += digit * digit * digit;
            num /= 10;
        }
        if (temp == arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not A ArmstrongNumber");
        }
    }
}
