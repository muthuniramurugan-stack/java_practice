package Arrays;

public class largest {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The Largest Element In An Array Is:" + largest);
    }
}
