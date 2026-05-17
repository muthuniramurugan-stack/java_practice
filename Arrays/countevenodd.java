package Arrays;

public class countevenodd {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println("OddCount:"+oddcount);
        System.out.println("EvenCount:"+evencount);
    }
}
