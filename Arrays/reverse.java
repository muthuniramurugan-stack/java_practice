package Arrays;

public class reverse {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9};  
        int rev[] = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[i] = arr[i];
            j++;
        }
        for(int nums:rev){
            System.out.println(nums);
        }
    }
}
