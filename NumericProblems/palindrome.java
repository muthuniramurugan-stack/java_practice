public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int rev = 0;
        int temp = n;
        while(temp>0){
            int digit = temp%10;
            rev = rev * 10+digit;
            temp/=10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
