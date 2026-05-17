package Arrays;

public class smallest {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 9, 1 };
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest Number In An Array Is:" + smallest);
    }
}
