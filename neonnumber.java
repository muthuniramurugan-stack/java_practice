public class neonnumber {
    public static void main(String[] args) {
        int num = 9;
        int sum = 0;
        int square = num * num;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (num == sum) {
            System.out.println("Neonnumber");
        } else {
            System.out.println("Not A Neonnumber");
        }
    }
}
