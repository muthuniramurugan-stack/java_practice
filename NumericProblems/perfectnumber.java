public class perfectnumber {
    public static void main(String[] args) {
        int num = 6;
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (num == total) {
            System.out.println("PerfectNumber");
        } else {
            System.out.println("Not A PerfectNumber");
        }
    }
}
