package Arrays;

public class seperateevenodd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = arr[i];
                System.out.println("Even Digits Are:" + even);
            } else {
                odd = arr[i];
                System.out.println("Odd Digits Are:" + odd);
            }
        }
    }
}
