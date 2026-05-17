package Arrays;

public class mergetwoarrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] merge = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[j] = arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[j] = arr2[i];
            j++;
        }
        for (int nums : merge) {
            System.out.print(nums + " ");
        }

    }
}
