package Strings;

public class replacespace {
    public static void main(String[] args) {
        String name = "Hi How Are You";
        String result = "";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch!=' '){
                result+=ch;
            }else{
                result+='-';
            }
        }
        System.out.println(result);
    }
}
