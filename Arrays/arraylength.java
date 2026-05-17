package Arrays;

public class arraylength {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int count = 0 ;
        for(int nums:arr){
            count++;
        }
        System.out.println("ArrayLength:"+count);
    }
}
