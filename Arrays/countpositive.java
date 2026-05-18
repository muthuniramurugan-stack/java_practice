package Arrays;

public class countpositive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, -2, -8, 9, 7, 6 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("The Number Of Positive Number In An Array Is:" + count);
    }
}
