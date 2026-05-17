package Arrays;

public class alternate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
        // Method 02
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}