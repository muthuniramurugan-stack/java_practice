package Arrays;

public class countnegative {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, -2, -8, 9, 7, 6 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("The number of negative in an array is:" + count);
    }
}
