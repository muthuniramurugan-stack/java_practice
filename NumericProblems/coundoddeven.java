public class coundoddeven {
    public static void main(String[]args){
        int num =12345678;
        int oddcount =0;
        int evencount=0;
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                evencount++;
            }else{
                oddcount++;
            }
            num/=10;
        }
        System.out.println("OddCount:"+oddcount);
        System.out.println("EvenCount:"+evencount);
    }
}
