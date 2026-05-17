package Arrays;

public class copyelements {
    public static void main(String[] args) {
        
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] arr1 = new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++){
        arr1[j]=arr[i];
        j++;
    }
    for(int nums:arr1){
        System.out.println(nums);
    }
}
}